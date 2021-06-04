import java.util.Scanner;
public class ComprobarNIF{

	public static void main(String[] args)
	{
		String nif;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame tu NIF: ");
		nif = teclado.next();

		ComprobarNIF objeto = new ComprobarNIF();
		objeto.mostrarMensaje(nif, objeto.comprobar(nif));
	}

	boolean comprobar(String nif){
		if(nif.length() == 9){
			//if(nif.isLetter(nif.substring(9))){
				//if(nif.isDigit(nif.substring(0,8))){
			return true;
				//}
			//}
		}
		return false;
	}
	void mostrarMensaje(String nif, boolean nifValido){
		if(nifValido)
		{
			System.out.println(nif + " es un NIF válido.");
			System.out.println("Parte numérica del NIF= " + nif.substring(0, 8));
		}
		else
		{
			System.out.println(nif + " no es un NIF válido.");
		}
	}
}