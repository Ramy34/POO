package juegos.letras;

import interfaces.Jugable;
import juegos.Juego;

public class JuegoAhorcado extends Juego implements Jugable{
	
	String cadenaAdivinar;
	JuegoAhorcado(int numeroVidas, String cadenaAdivinar){
		super(numeroVidas);
		this.cadenaAdivinar = cadenaAdivinar;
	}
	public void juega(){
		String nuevaCadena = null;
		reiniciarPartida();
		for(int i = 0; i < cadenaAdivinar.length(); i++){
			nuevaCadena = nuevaCadena + "-" ;
		}
		System.out.println(nuevaCadena);
	}
}