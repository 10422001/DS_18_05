import java.io.*;
import java.net.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
//    public static void main(String[] args){
//
//        String clientSentence;
//        String capitalizedSentence;
//
//        try {
//            ServerSocket welcomeSocket = new ServerSocket(6789);
//            System.out.println("Server is running");
//
//            while(true) {
//                Socket connectionSocket = welcomeSocket.accept();
//                System.out.println("Client connected");
//                BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
//                DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
//                clientSentence = inFromClient.readLine();
//                System.out.println(clientSentence);
//                capitalizedSentence = clientSentence.toUpperCase();
//                outToClient.writeBytes(capitalizedSentence + '\n');
//                System.out.println("Client disconnected");
//                connectionSocket.close();
//            }
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//    }


    public void runServer(){

        String clientSentence;
        String capitalizedSentence;

        try {
            ServerSocket welcomeSocket = new ServerSocket(6789);
            System.out.println("Server is running");

            while(true) {
                Socket connectionSocket = welcomeSocket.accept();
                System.out.println("connectionSocket: " + connectionSocket);
                BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
                DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
                clientSentence = inFromClient.readLine();
                System.out.println(clientSentence);
                capitalizedSentence = clientSentence.toUpperCase();
                outToClient.writeBytes(capitalizedSentence + '\n');
//                System.out.println("Client disconnected");
//                connectionSocket.close();
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        TCPServer tcpserver = new TCPServer();
        tcpserver.runServer();
    }


}
