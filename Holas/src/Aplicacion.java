import profesor.Teclado;
import numeros.JuegoAdivinaImpar;
import numeros.JuegoAdivinaNumero;
import numeros.JuegoAdivinaPar;
import interfaces.Jugable;


public class Aplicacion 
{
	public static Jugable eligeJuego()
	{
		int opcion;
		
		JuegoAdivinaNumero jan = new JuegoAdivinaNumero(3);
		JuegoAdivinaPar jap = new JuegoAdivinaPar(3);
		JuegoAdivinaImpar jai = new JuegoAdivinaImpar(3);
		
		Jugable arrayJugable[] = new Jugable[3];
		arrayJugable[0] = jan;
		arrayJugable[1] = jap;
		arrayJugable[2] = jai;
		
		do
		{
			System.out.println("Selecciona el juego de tu preferencia: ");
			System.out.println("0. Adivina Número");
			System.out.println("1. Adivina Número PAR");
			System.out.println("2. Adivina Número IMPAR");
			
			opcion = Teclado.datoEntero();
		}while(opcion < 0 && opcion > 2);
		
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
