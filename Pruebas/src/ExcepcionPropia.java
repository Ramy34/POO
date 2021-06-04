
public class ExcepcionPropia extends Exception{
	
	private String nombre;
	
	ExcepcionPropia(String nombre){
		this.nombre = nombre;
	}
	
	public String toString(){
		return "Nombre de usuario no válido.\nIngrese un nombre de usuario válido: ";
	}
}
