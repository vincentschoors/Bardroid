
package kasserver.Listeners;


public interface ClientConnectionListener {
    public void onDataRecieved(int socket, String[] data);
}
