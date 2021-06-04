package lugares;
import java.util.ArrayList;

import humanos.Alumno;
import humanos.Profesor;

public abstract class Grupo extends Dependencia{
	
	private String materia, codigoGrupo, salon, horario;
	
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getCodigoGrupo() {
		return codigoGrupo;
	}

	public void setCodigoGrupo(String codigoGrupo) {
		this.codigoGrupo = codigoGrupo;
	}

	public String getSalon() {
		return salon;
	}

	public void setSalon(String salon) {
		this.salon = salon;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public Grupo(String nombreCompleto, String nombreCorto, String ubicacion, String materia, String codigoGrupo, String salon, String horario) {
		super(nombreCompleto, nombreCorto, ubicacion);
		this.materia = materia;
		this.codigoGrupo = codigoGrupo;
		this.salon = salon;
		this.horario = horario;
	}

	ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	
	void agregarAlumno(Alumno a){
		alumnos.add(a);
	}
	
	void agregarProfesor(Profesor p){
		Profesor pro = new Profesor(p.getNombre(),p.getApellidoPaterno(),p.getApellidoMaterno(),p.getId(), p.getGradoAcademico(), p.getTipo());
	}
	
	abstract void listaApellidoPaterno();
	
	abstract void listaNumeroCuenta();
	
	abstract void listaNumeroFaltasAascendente();
	
	abstract void listaNumeroFaltasDescendente();
	
	abstract void listaCarrera();
	
}
