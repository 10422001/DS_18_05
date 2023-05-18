import java.net.Socket;
import java.net.*;
import java.io.*;

public class getSocketInfo {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.google.com", 80);
            System.out.println("Connected to " + socket.getInetAddress() + " on port " + socket.getPort() + " from port " + socket.getLocalPort() + " of " + socket.getLocalAddress());
            socket.close();
        } catch (UnknownHostException e) {
            System.err.println("I can't find " + e);
        } catch (SocketException e) {
            System.err.println("Could not connect to " + e);
        } catch (IOException e) {
            System.err.println(e);
        }
    }



}
