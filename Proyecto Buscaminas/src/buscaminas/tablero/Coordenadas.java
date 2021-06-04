package buscaminas.tablero;

public class Coordenadas {
	private int coordenada1, coordenada2;

	public int getCoordenada1() {
		return coordenada1;
	}

	public void setCoordenada1(int coordenada1) {
		this.coordenada1 = coordenada1;
	}

	public int getCoordenada2() {
		return coordenada2;
	}

	public void setCoordenada2(int coordenada2) {
		this.coordenada2 = coordenada2;
	}

	
	public Coordenadas(int coordenada1, int coordenada2) {
		super();
		this.coordenada1 = coordenada1;
		this.coordenada2 = coordenada2;
	}
}
