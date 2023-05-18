//import java.rmi.UnknownHostException;
//
//public class SocketDemo {
//
//    public static void main(String[] args) {
//        System.out.println("main is running...");
//
//        for (int i = 0; i < args.length; i++) {
//            try {
//                Socket theSocket = new Socket(args[i], 80);
//                System.out.println("Connected to " + theSocket.getInetAddress()
//                        + " on port " + theSocket.getPort() + " from port "
//                        + theSocket.getLocalPort() + " of "
//                        + theSocket.getLocalAddress());
//            }
//            catch (UnknownHostException e) {
//                System.err.println("I can't find " + args[i]);
//            }
//
//        }
//
//    }
//}
