package buscaminas.exception;

public class ExceptionNombre extends Exception{
	
private String nombre;
	
	public ExceptionNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String toString(){
		return "Nombre de usuario no válido.\nIngrese un nombre de usuario válido: ";
	}
}
