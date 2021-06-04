package juegos;

public abstract class Juego 
{
	protected int numeroVidas;
	protected int vidasIniciales;
	private static int record=0;
	
	protected Juego(int numero)
	{
		numeroVidas = numero;
		vidasIniciales = numero;
	}
	
	protected boolean quitaVida()
	{
		numeroVidas--;
		
		if(numeroVidas > 0)
			return true;
		else
		{
			System.out.println("Juego terminado");
			return false;
		}
	}
	
	protected void reiniciarPartida()
	{
		numeroVidas = vidasIniciales;
	}
	
	protected void actualizaRecord()
	{
		if(numeroVidas == record)
			System.out.println("Se ha alcanzado el record");
		else
			if(numeroVidas > record)
			{
				record = numeroVidas;
				System.out.println("Se ha batido el record: " + record);
			}
	}
	
	protected void muestraVidasRestantes()
	{
		System.out.println("Número de vidas: " + numeroVidas);
	}
	
	//abstract void juega();
	
	/*public static void main(String a[])
	{
		Juego j = new Juego(5);
		j.muestraVidasRestantes();
		j.numeroVidas--;
		j.muestraVidasRestantes();
		
		Juego j2 = new Juego(5);
		j2.muestraVidasRestantes();
		j.muestraVidasRestantes();
	}*/
}
