/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasserver;
import com.google.gson.Gson;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import kasserver.Listeners.ClientConnectionListener;
 
/**
 * This thread is responsible to handle client connection.
 *
 * @author www.codejava.net
 */
public class ServerThread extends Thread {
    private Socket socket;
    public Table[] tableData;
    public Bartender[] BartenderData;
    public Consumable[] consumableData;
    // arno
    public List<ClientConnectionListener> listeners;
    
    public ServerThread(Socket socket, KasServer s) {
        this.socket = socket;
        this.listeners = new ArrayList();
    }
 
    public void addListemer(ClientConnectionListener listener) {
        this.listeners.add(listener);
    }
            
    public void run() {
        try {
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
 
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
 
            String text;
            Table tafel1;
            Gson gson = new Gson();
            
            do {
                text = reader.readLine();
                // arno
                for(ClientConnectionListener listener : listeners) {
                    listener.onDataRecieved(1, new String[]{text} );
                }
                
                tafel1 = gson.fromJson(text, Table.class);
                text = gson.toJson(tafel1);
                writer.println(text);
 
            } while (!text.equals("bye"));
 
            socket.close();
        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
