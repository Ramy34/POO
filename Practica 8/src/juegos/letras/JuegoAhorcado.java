package juegos.letras;

import interfaces.Jugable;
import juegos.Juego;
import java.util.Scanner;

public class JuegoAhorcado extends Juego implements Jugable{
	
	Scanner teclado = new Scanner(System.in);
	
	String cadenaAdivinar = "Hola";
	
	public JuegoAhorcado(int numeroVidas, String cadenaAdivinar){
		super(numeroVidas);
		this.cadenaAdivinar = cadenaAdivinar;
	}
	public void juega(){
		String letra;
		String nuevaCadena = " ";
		reiniciarPartida();
		for(int i = 0; i < cadenaAdivinar.length(); i++){
			nuevaCadena = nuevaCadena + "-" ;
		}
		System.out.println(nuevaCadena);
		System.out.println("Dame un caracter: ");
		letra = teclado.next();
		
	}
	
	public void muestraNombre(){
		System.out.println("Juego del ahorcado.");
	}
	
	public void muestraInfo(){
		System.out.println("Escribe una letra para tratar de adivinar la frase.");
	}
}