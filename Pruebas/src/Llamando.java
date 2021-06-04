import java.util.Scanner;

public class Llamando {
	
	static boolean validarNombre(String nombre) throws ExcepcionPropia{
		for(int i = 0; i < nombre.length(); i++){
			if(Character.isLetter(nombre.charAt(i)) == false){
				throw new ExcepcionPropia(nombre);
				}
			}
		System.out.println("Nombre: " + nombre);
		return true;
	}
	
	public static void main(String args[]) throws ExcepcionPropia{
		Scanner teclado = new Scanner(System.in);
		String hola;
		try{
	        System.out.print("Dame un nombre: ");
		    hola = teclado.next();
		    validarNombre(hola);
		}
		catch(ExcepcionPropia e){
			System.out.println(e);
			hola = teclado.next();
			validarNombre(hola);
		}
	}
}