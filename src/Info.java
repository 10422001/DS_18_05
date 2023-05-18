import java.net.InetAddress;
import java.net.UnknownHostException;

public class Info {

    public static void main(String[] args) {

        try {
            InetAddress[] addresses =
                    InetAddress.getAllByName("www.vgu.edu.vn");
            for (int i = 0; i < addresses.length; i++) {
                System.out.println(addresses[i]);
            }
        } catch (UnknownHostException e) {
            System.out.println("Could not find www.vgu.edu.vn");
        }
    }
}