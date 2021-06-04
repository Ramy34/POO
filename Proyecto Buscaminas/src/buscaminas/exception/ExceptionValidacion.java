package buscaminas.exception;

public class ExceptionValidacion extends Exception{
	
	String coordenada1;
	int coordenada2;
	
	ExceptionValidacion(String coordenada){
		coordenada1 = coordenada;
	}
	
	ExceptionValidacion(int coordenada){
		coordenada2 = coordenada;
	}
	
	public String toString(){
		return "Coordenada invalida.\nIngresa una coordenada valida: ";
	}
}
