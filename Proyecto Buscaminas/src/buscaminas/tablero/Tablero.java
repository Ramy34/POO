package buscaminas.tablero;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import buscaminas.exception.ExceptionValidacionLetras;
import buscaminas.exception.ExceptionValidacionNumeros;

public class Tablero {
	
	Scanner teclado = new Scanner(System.in);
	private int dimension;
	private char caracterSinDestapar, caracterDestapado, tablero[][];
	char a[][];
	boolean casillaMina;
	String coordenadas;
	ArrayList<Coordenadas> minas = new ArrayList<Coordenadas>();
	ArrayList<Coordenadas> casillas = new ArrayList<Coordenadas>();
	int casillasRestantes;
	
	public Tablero(int dimension, char caracterSinDestapar, char caracterDestapado) {
		super();
		this.caracterSinDestapar = caracterSinDestapar;
		this.caracterDestapado = caracterDestapado;
		this.dimension = dimension;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public char getCaracterSinDestapar() {
		return caracterSinDestapar;
	}

	public void setCaracterSinDestapar(char caracterSinDestapar) {
		this.caracterSinDestapar = caracterSinDestapar;
	}

	public char getCaracterDestapado() {
		return caracterDestapado;
	}

	public void setCaracterDestapado(char caracterDestapado) {
		this.caracterDestapado = caracterDestapado;
	}

	public char[][] getTablero() {
		return tablero;
	}

	public void setTablero(char[][] tablero) {
		this.tablero = tablero;
	}
	
	public void llenarTablero(){
		tablero = new char[dimension][dimension];
		a = new char[dimension][dimension];
		for(int i = 0; i < dimension; i++){
			for(int j = 0; j < dimension; j++){
				tablero[i][j] = caracterSinDestapar;
				a[i][j] = caracterDestapado;
			}
		}
	}
	
	public void mostrarTablero(){	
		System.out.print(" ");
		char letra = 65;
		for(int v = 64; v < (64 + dimension); v++){
			System.out.print(" " + letra++);
		}
		System.out.println();
		for(int i = 0; i < dimension; i++){
			System.out.print(i + 1);
			for(int j = 0; j < dimension; j++){
				System.out.print(" " + tablero[i][j]);
			}
			System.out.println();
		}
	}

	public int numeroMinas(){
		int minasTotales = 0, minasJugar = 0;
		minasTotales = (int) Math.pow(dimension, 2);
		minasJugar = (int) Math.round(minasTotales * 0.4);
		casillasRestantes = (int) Math.pow(dimension, 2) - minasJugar;
		return minasJugar;
	}
	
	public void agregarMinas(){
		int m = numeroMinas(), minasActuales = 0;
		int j,k;
		Random ran = new Random();
		while(minasActuales < m){
			j = (int) Math.round(ran.nextDouble() * (dimension - 1));
			k = (int) Math.round(ran.nextDouble() * (dimension - 1)); //Crea coordenadas al azar
			if (minasActuales == 0){ //Agrega el par de coordenadas si es la primera
				Coordenadas mi = new Coordenadas(j,k);
				minas.add(mi);
				minasActuales += 1;
			}
			else{   
				int aux=0;
				Iterator i = minas.iterator();
				while(i.hasNext()){
					Coordenadas mi1 = (Coordenadas)i.next();
					if(j == mi1.getCoordenada1() && k == mi1.getCoordenada2()){ //Validación del par de coordenadas para ver que no se repite con otro par ya existente
						aux += 1;
					}
				}
				if(aux == 0 ){ //Agrega el par después de comprobar que no hay otro igual
					Coordenadas mi1 = new Coordenadas(j,k);
					minas.add(mi1);
				    minasActuales += 1;
				}
			}
			
		}
		agregarMinaAlTablero();
	}
	
	public void agregarMinaAlTablero(){
		int d,j;
		for(d = 0; d < dimension; d++){  //Asignando las minas en las coordenadas corresponidentes
			for (j = 0; j < dimension; j++){
				Iterator i = minas.iterator();
				while(i.hasNext()){
					Coordenadas mi1 = (Coordenadas)i.next();
					if(d == mi1.getCoordenada1() && j == mi1.getCoordenada2()){
						a[d][j] = 'X';
					}
				}
			}
		}
	}
	
	public void revelearCaracter(String coordenadas){
		try{
		    String aux1;
		    char aux,aux2;
		    int c1 = 100, c2= -1, letra = 64;
		    String[] lp = coordenadas.split(",");
		    aux1 = lp[0].toUpperCase();
		    if(aux1.length() > 1){ //Lanza error si se ingresa más de una letra
		    	throw new ExceptionValidacionLetras(aux1);
		    }
		    aux = aux1.charAt(0);
		    if((int)aux > (64 + dimension) || Character.isDigit(aux)){  //Lanza error si la letra no pertenece a la dimensión del tablero
		    	throw new ExceptionValidacionLetras(aux1);
		    }
		    aux1 = lp[1];
		    aux2 = aux1.charAt(0);
		    if(Character.isLetter(aux2)){
		    	throw new ExceptionValidacionLetras(aux1);
		    }
		    c2 = Integer.parseInt(lp[1]) - 1;
		    if(c2 > dimension || c2 == -1){  //Lanza error si el número no pertenece a la dimensión del tablero
		    	throw new ExceptionValidacionNumeros(c2);
		    }
		    for (int i = 64; i < 90; i++, letra++){  //Convierte la letra en su equivalente en el tablero
			    if((int)aux == letra){
				    c1 = letra - 65;
			    }
		    }
		    Iterator i = casillas.iterator();
		    while(i.hasNext()){
		    	Coordenadas mi1 = (Coordenadas)i.next();
			    if(c2 == mi1.getCoordenada1() && c1 == mi1.getCoordenada2()){  //Comprueba si la mina ya ha sido descubierta con anterioridad
				    System.out.println("Casilla [" + aux + "]" + "[" + (c2 +1) + "] ya fue descubierta");
				    mostrarTablero();
				    casillaMina = false;
			    }
		    }
		    tablero[c2][c1] = a[c2][c1];
		    mostrarTablero();
		    if(tablero[c2][c1] == 'X'){  //Comprueba si en la coordenada hay una mina 
			    System.out.println("Mina encontrada en la posición [" + aux + "]" + "[" + (c2 + 1) + "]");
			    //System.out.println("Juego Terminado");
			    casillaMina = true;
		    }
		    else{  //Agrega la coordenada a un array que sirve para comprobar si ya ha sido descubierta, y aparte da el número de casillas sin minas por descubrir
		    	Coordenadas mi = new Coordenadas(c2,c1);
			    casillas.add(mi);
			    casillasRestantes -= 1;
			    System.out.println("Casillas sin minas restantes: "+ casillasRestantes);
			    casillaMina = false;
		    }
		}
		catch(ExceptionValidacionLetras e){
			System.out.println(e);
			coordenadas = teclado.next();
			revelearCaracter(coordenadas);
		}
		catch(ExceptionValidacionNumeros e){
			System.out.println(e);
			coordenadas = teclado.next();
			revelearCaracter(coordenadas);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public boolean continuarJuego(){
		if(casillasRestantes == 0){
			System.out.println("Felicidades has ganado");
			return false;
		}
		if(casillaMina){
			System.out.println("Lo siento, has perdido.");
			return false;
		}
		return true;
	}

	public void tableroMinasEjemplo(){
		for(int i=0; i<dimension; i++){
			for(int j=0; j<dimension; j++){
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
	}
	
}