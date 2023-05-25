import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;


public class TCPClient {

    public void runClient() throws Exception {

//        String serverSentence;
//        String capitalizedSentence;
//while(true) {

    Socket s = new Socket("localhost", 6789);
    BufferedReader inFromServer = new BufferedReader(new InputStreamReader(s.getInputStream()));
    DataOutputStream outToServer = new DataOutputStream(s.getOutputStream());
    BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
//    while(true) {
        outToServer.writeBytes(userInput.readLine() + '\n');
        String result = inFromServer.readLine();
        System.out.println("From Server: " + result);
//    }
//        s.close();
//}
//        }
    }

    public static void main(String[] args) throws Exception{
//        TCPServer tcpserver = new TCPServer();
//        tcpserver.runServer();
        TCPClient tcpclient = new TCPClient();
        tcpclient.runClient();
    }
}
