package PP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JOptionPane;

public class Client{
	
    public static void main(String[] args) throws IOException {
    	Autenticacion datos = new Autenticacion();
        String ip = datos.getIp();
        int port = datos.getPort();
        
        System.out.println("Dirección ip: " + ip);
        System.out.println("Puerto: " + port);
        
        String serverAddress = JOptionPane.showInputDialog("Enter IP Address of a machine that is\n" +"running the date service on port 9090:");
        Socket s = new Socket(ip, port);
        BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String answer = input.readLine();
        JOptionPane.showMessageDialog(null, answer);
        System.exit(0);
    }
}

