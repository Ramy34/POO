package buscaminas.exception;

public class ExceptionValidacionNumeros extends ExceptionValidacion{
	int coordenada;
	
	public ExceptionValidacionNumeros(int coordenada){
		super(coordenada);
	}
}
