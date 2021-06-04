
public class CodigoAscii {
	public static void main(String args[]){
		char letra = 65;
		char  let= 'A';
		int aux;
		for (int i = 64; i < 90; i++, letra++){
			if((int)let == letra){
				aux = letra;
				System.out.println("La letra es la: " + letra + "\nSu numero es: " + (aux-65));
			}
		}
	}
}
