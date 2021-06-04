package lugares;
import java.util.ArrayList;

public class Dependencia {
	private String nombreCompleto, nombreCorto, ubicacion;

	public Dependencia(String nombreCompleto, String nombreCorto, String ubicacion) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.nombreCorto = nombreCorto;
		this.ubicacion = ubicacion;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getNombreCorto() {
		return nombreCorto;
	}

	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	ArrayList<Grupo> grupos = new ArrayList<Grupo>();
	
	void agregarGrupo(Grupo g){
		grupos.add(g);
	}
	
	

}