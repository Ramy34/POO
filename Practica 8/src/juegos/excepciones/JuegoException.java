package juegos.excepciones;

public class JuegoException extends Exception{
	
	String cadena;
	
	JuegoException(String cadena){
		this.cadena = cadena;
	}
	
	public String toString(){
		return "";
	}
}
