package numeros;

import java.util.Random;

public class JuegoAdivinaPar extends JuegoAdivinaNumero
{
	public JuegoAdivinaPar(int numeroVidas)
	{
		super(numeroVidas);
	}
	
	public void muestraNombre()
	{
		System.out.println("Adivina un Número entero PAR");
	}
	
	public void muestraInfo()
	{
		System.out.println("Adivina un Número par entre 0 y 10");
		muestraVidasRestantes();
	}
	
	boolean validaNumero(int numero)
	{		
		if(numero%2 == 0)
			return true;
		else
		{
			System.out.println("El numero debe ser par");
			return false;
		}
	}

	public void reiniciarPartida(){
		boolean salir = true;
		numeroVidas = vidasIniciales;
		Random objeto = new Random();
		do{
			numeroAdivinar = objeto.nextInt(11);
			if (numeroAdivinar % 2 == 0){
				salir = false;
			}
		}
		while(salir == true);
	}
}
