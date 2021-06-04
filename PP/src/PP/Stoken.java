package PP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Stoken {

    
    public static String stoken(){
        BufferedReader br = null;

        try {
            String line;

            br = new BufferedReader(new FileReader("C:\\Users\\Orlando\\Documents\\NetBeansProjects\\PP\\Usuarios\\users.txt"));

            while ((line = br.readLine()) != null) 
            {
		System.out.println(line);

                StringTokenizer stringTokenizer = new StringTokenizer(line, ",");

                while (stringTokenizer.hasMoreElements()) {
                    
		    String username = stringTokenizer.nextElement().toString();
		    /*String pwd = stringTokenizer.nextElement().toString();
		    Integer cont = Integer.parseInt(stringTokenizer.nextElement().toString());
		    Boolean bandera = Boolean.parseBoolean(stringTokenizer.nextElement().toString());
                    
			StringBuilder sb = new StringBuilder();
			sb.append("\nUsuario : " + username);
			sb.append("\nPassword : " + pwd);
			sb.append("\nContador : " + cont);
			sb.append("\nBandera : " + bandera);
			sb.append("\n*******************\n");

			System.out.println(sb.toString());
                    */
                    
		}
            }

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
                try {
                   if (br != null)
                        br.close();

                    } catch (IOException ex) {
			ex.printStackTrace();
                    }
        }
        return null;
    }
 
    public static void main(String[] args) {
        stoken();
    }
}