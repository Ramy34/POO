
public class UsarMetodosString {

	public static void main(String[] args) {
		String cadena = new String("En mi próxima vida, creeré en la rencarnación");
		System.out.println(cadena);
		System.out.println("Longitud: " + cadena.length());
		System.out.println("El caracter asociado al indide 7: " + cadena.charAt(7));
		System.out.println("La subcadena : " + cadena.substring(20,26));
		System.out.println("El índice que ocupa el carácter 'x': " + cadena.indexOf("x"));
		System.out.println("La cadena transformada en mayúsculas: " + cadena.toUpperCase());
		System.out.println("La cadena transformada en minúsculas: " + cadena.toLowerCase());
		System.out.println("¿El primer carácter de la cadena es 'E'?: " + cadena.startsWith("E"));
		System.out.println("La cadena terminan con 'carnación': " + cadena.endsWith("carnación"));
		System.out.println(cadena + ". Por mi raza hablará el espiritu");
	}

}
