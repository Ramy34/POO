import java.util.Scanner;

public class Prueba {
	
	static public void revelarCaracter(String coordenada){
		char c1;
		int c2;
		String[] lp = coordenada.split(",");
		c1 = lp[0].charAt(0);
		c2 = Integer.parseInt(lp[1]);
		System.out.println("Coordenada 1: " + c1 + "\nCoordenada 2: " + c2);
	}
	
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		String coordenada;
		
		System.out.println("Ingresa una coordenada: ");
		coordenada = teclado.next();
		
		revelarCaracter(coordenada);
	}
}
