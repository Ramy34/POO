import numeros.JuegoAdivinaImpar;
import numeros.JuegoAdivinaNumero;
import numeros.JuegoAdivinaPar;
import juegos.letras.JuegoAhorcado;
import interfaces.Jugable;


public class Aplicacion 
{
	public static Jugable eligeJuego()
	{
		int opcion;
		
		JuegoAdivinaNumero jan = new JuegoAdivinaNumero(3);
		JuegoAdivinaPar jap = new JuegoAdivinaPar(3);
		JuegoAdivinaImpar jai = new JuegoAdivinaImpar(3);
		JuegoAhorcado ja = new JuegoAhorcado(3,"Hola");
		
		Jugable arrayJugable[] = new Jugable[4];
		arrayJugable[0] = jan;
		arrayJugable[1] = jap;
		arrayJugable[2] = jai;
		arrayJugable[3] = ja;
		
		do
		{
			System.out.println("Selecciona el juego de tu preferencia: ");
			System.out.println("0. Adivina N�mero");
			System.out.println("1. Adivina N�mero PAR");
			System.out.println("2. Adivina N�mero IMPAR");
			System.out.println("3. Adivina Palabra");
			
			opcion = Teclado.datoEntero();
		}while(opcion < 0 && opcion > 3);
		
		return arrayJugable[opcion];
	}
	
	public static void main(String[] args) 
	{
		int respuesta;
		
		do
		{
			Jugable juego = eligeJuego();
			juego.muestraNombre();
			juego.muestraInfo();
			juego.juega();
			
			System.out.println("Deseas jugar nuevamente? si=1, no=0");
			respuesta = Teclado.datoEntero();
		}while(respuesta == 1);
	}
}
