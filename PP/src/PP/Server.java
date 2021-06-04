package PP;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server{
	
    public static void main(String[] args) throws IOException {
    	Autenticacion datos = new Autenticacion();
        int puerto = datos.getPort();
        ServerSocket listener = new ServerSocket(puerto);
        
        try {
            while (true) {
                Socket socket = listener.accept();
                try {
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    out.println("Conexion Exitosa "+new Date().toString());
                } finally {
                    socket.close();
                }
            }
        }
        finally {
            listener.close();
        }
    }
}