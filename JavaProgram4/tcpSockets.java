import java.io.*;
import java.net.*;

public class tcpSockets {
    public static void main(String[] args) {
        String hostName = "www.sunnetwork.in";
        int portNumber = 80;

        try{
            Socket socket = new Socket(hostName ,portNumber);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out.println("GET/HTTP/1.1\nHost: www.sunnetwork.in\n\n");
            String inputLine;
            while((inputLine = in.readLine()) != null){
                System.out.println(inputLine);
            }           
        }
        catch (UnknownHostException e){
            System.out.println("Don't know about host"+ hostName);
            System.exit(1);
        }

        catch(IOException e){
            System.out.println("Couldn't get I/O for the connection to"+hostName);
            System.exit(1);
        }
    }
}
