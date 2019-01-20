
package kasserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import kasserver.Listeners.ClientConnectionListener;
import sun.rmi.runtime.Log;

public class KasServer implements ClientConnectionListener {

    public static void main(String[] args) {
 
        int port = 3434;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
 
            System.out.println("Server is listening on port " + port);
 
            while (true) {
                Socket socket = serverSocket.accept();
        
                System.out.println("New client connected");
 
                ServerThread newConnection = new ServerThread(socket, this);
                newConnection.addListemer(this);
            }
 
        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    @Override
    public void onDataRecieved(int socket, String[] data) {
        System.out.println("nummer:" + socket + ",data: " + data);
    }

   
    
}
