package numeros;
import profesor.Teclado;
import interfaces.Jugable;
import juegos.Juego;
import java.util.Random;

public class JuegoAdivinaNumero extends Juego implements Jugable
{
	int numeroAdivinar;
	
	public JuegoAdivinaNumero(int numeroVidas)
	{
		super(numeroVidas);
	}
	
	boolean validaNumero(int numero)
	{
		return true;
	}
	
	public void muestraNombre()
	{
		System.out.println("Adivina un Número entero");
	}
	
	public void muestraInfo()
	{
		System.out.println("Adivina un Número entre 0 y 10");
		muestraVidasRestantes();
	}
	
	public void reiniciarPartida(){
		Random objeto = new Random();
		numeroAdivinar = objeto.nextInt(11);
		numeroVidas = vidasIniciales;
	}
	
	public void juega()
	{
		reiniciarPartida();
		boolean res = true;
		do
		{
			int numero;
			do
			{
				//System.out.println("Adivina un numero entre 0 y 10");
				numero = Teclado.datoEntero();
			}while(!validaNumero(numero));
			
			
			if(numeroAdivinar == numero)
			{	
				System.out.println("Acertaste");
				actualizaRecord();
				res = false;
			}
			else
			{
				res = quitaVida();
				if(res)
				{
					if(numero < numeroAdivinar)
						System.out.println("El número a adivinar es mayor");
					else
						System.out.println("El número a adivinar es menor");
					
					System.out.println("Intentalo nuevamente");
				}
			}
		}
		while(res);	
	}
}