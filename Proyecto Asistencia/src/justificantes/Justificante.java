package justificantes;

public class Justificante {
	private String fecha, motivo;

	public Justificante(String fecha, String motivo) {
		super();
		this.fecha = fecha;
		this.motivo = motivo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
}
