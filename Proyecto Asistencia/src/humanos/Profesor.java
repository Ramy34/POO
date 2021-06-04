package humanos;
public class Profesor extends Persona{
	private String gradoAcademico, tipo;

	public Profesor(String nombre, String apellidoPaterno, String apellidoMaterno, String id,
			String gradoAcademico, String tipo) {
		super(nombre, apellidoPaterno, apellidoMaterno, id);
		this.gradoAcademico = gradoAcademico;
		this.tipo = tipo;
	}

	public String getGradoAcademico() {
		return gradoAcademico;
	}

	public void setGradoAcademico(String gradoAcademico) {
		this.gradoAcademico = gradoAcademico;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}