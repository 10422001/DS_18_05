import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.net.Socket;

public class UDPServer {

    public void runServer() throws Exception{

        DatagramSocket serverSocket = new DatagramSocket(9876);
        byte receiveData[] = new byte[1024];
        byte sendData[] = new byte[1024];
        while(true) {
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);
            String sentence = new String(receivePacket.getData());
            InetAddress IPAddress = receivePacket.getAddress();
            int port = receivePacket.getPort();
            System.out.println("From Client " + IPAddress + " at port " + port + " with data " + sentence);
            String capitalizedSentence = sentence.toUpperCase();
            sendData = capitalizedSentence.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
            serverSocket.send(sendPacket);


        }
    }

    public static void main(String[] args) throws Exception {
        UDPServer tcpserver = new UDPServer();
        tcpserver.runServer();
    }


}
