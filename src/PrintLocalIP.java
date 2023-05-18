import java.net.InetAddress;

public class PrintLocalIP {

    public void init() {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println("IP Address:- " + inetAddress.getHostAddress());
            System.out.println("Host Name:- " + inetAddress.getHostName());
        } catch (Exception e) {
            System.out.println("Exception caught = " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        PrintLocalIP printLocalIP = new PrintLocalIP();
        printLocalIP.init();
    }

}
