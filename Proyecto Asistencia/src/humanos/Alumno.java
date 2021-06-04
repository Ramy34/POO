package humanos;

public class Alumno extends Persona{
	private String claveCarrera;

	public Alumno(String numeroCuenta, String nombre, String apellidoPaterno, String apellidoMaterno,
			String id) {
		super(nombre, apellidoPaterno, apellidoMaterno, id);
		this.setClaveCarrera(claveCarrera);
	}

	public String getClaveCarrera() {
		return claveCarrera;
	}

	public void setClaveCarrera(String claveCarrera) {
		this.claveCarrera = claveCarrera;
	}

}
