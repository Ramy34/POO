import java.util.Scanner;

import buscaminas.exception.ExceptionNombre;
import buscaminas.personas.Usuario;
import buscaminas.tablero.Tablero;

public class Menu {
	
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		int tamaño;
		char c1 = '?', c2 = 'O';
		String nombreUsuario, co1, coordenadas;
		byte co2,opcion;
		boolean validacion, salir = true, v1 = false;
		
		System.out.println("Buscaminas.");
		
		do{
			System.out.print("Ingresa un nombre de usuario: ");
			nombreUsuario = teclado.next();
			Usuario nombre = new Usuario(nombreUsuario);
			v1 = nombre.validarUsuario();
			nombreUsuario = nombre.getNombreUsuario();
		}
		while(v1 == false);
		do{
			nombreUsuario = nombreUsuario.substring(0,1).toUpperCase() + nombreUsuario.substring(1, nombreUsuario.length()).toLowerCase();
			System.out.println("Hola "+ nombreUsuario + "\nEste juego de buscaminas es distinto al que ya has jugado, dado que no hay sugerencias."
					+ "\nEl formato en el que se deberá seleccionar una casilla es de: letra,numero");
			System.out.print("\t1)Iniciar Partida.\t2)Salir.\nSelecciona una opción: ");
			opcion = teclado.nextByte();
			switch(opcion){
			    case(1):
			    	System.out.print("¿De qué tamaño quieres que sea el tablero?: ");
			    	tamaño = teclado.nextInt();
					Tablero tab = new Tablero(tamaño, c1, c2);
					tab.llenarTablero();
					tab.agregarMinas();
					//tab.tableroMinasEjemplo();
					tab.mostrarTablero();
					do{
						System.out.print("Ingresa la coordenada separada por una coma: ");
						coordenadas = teclado.next();
						tab.revelearCaracter(coordenadas);
						validacion = tab.continuarJuego();
					}
					while(validacion);
				    break;
			    case(2): 
			    	salir = false;
			        System.out.println("Adios " + nombreUsuario + ".");
			        break;
			    default:
			    	System.out.println("Opción invalida");
			}
		}
		while(salir);
	}
}