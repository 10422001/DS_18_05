import java.io.*;
import java.net.Socket;


public class TCPClient_slides {

    public static void main(String[] args) throws Exception {
        String sentence;
        String modifiedSentence;
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

        Socket clientSocket = new Socket("localhost",6789);

        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());



    }
}
