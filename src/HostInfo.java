import java.net.*;

public class HostInfo {



    public void init() {
        try {
            InetAddress myHost = InetAddress.getLocalHost();
            System.out.println(myHost.getHostAddress());
            System.out.println(myHost.getHostName());
        } catch (UnknownHostException e) {
            System.err.println("Cannot find local host");
        }
    }


    public static void main(String args[]) {
        HostInfo host = new HostInfo();
        host.init();
    }



}
