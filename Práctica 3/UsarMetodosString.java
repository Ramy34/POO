
public class UsarMetodosString {

	public static void main(String[] args) {
		String cadena = new String("En mi pr�xima vida, creer� en la rencarnaci�n");
		System.out.println(cadena);
		System.out.println("Longitud: " + cadena.length());
		System.out.println("El caracter asociado al indide 7: " + cadena.charAt(7));
		System.out.println("La subcadena : " + cadena.substring(20,26));
		System.out.println("El �ndice que ocupa el car�cter 'x': " + cadena.indexOf("x"));
		System.out.println("La cadena transformada en may�sculas: " + cadena.toUpperCase());
		System.out.println("La cadena transformada en min�sculas: " + cadena.toLowerCase());
		System.out.println("�El primer car�cter de la cadena es 'E'?: " + cadena.startsWith("E"));
		System.out.println("La cadena terminan con 'carnaci�n': " + cadena.endsWith("carnaci�n"));
		System.out.println(cadena + ". Por mi raza hablar� el espiritu");
	}

}
