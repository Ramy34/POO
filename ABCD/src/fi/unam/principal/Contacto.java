package fi.unam.principal;

public class Contacto {
 
	private String nombre, apellidoPaterno, apellidoMaterno, celular, telefono;

	public String getNombre() {
	return nombre;
}

	public void setNombre(String nombre) {
	this.nombre = nombre;
}

	public String getApellidoPaterno() {
	return apellidoPaterno;
}

	public void setApellidoPaterno(String apellidoPaterno) {
	this.apellidoPaterno = apellidoPaterno;
}

	public String getApellidoMaterno() {
	return apellidoMaterno;
}

	public void setApellidoMaterno(String apellidoMaterno) {
	this.apellidoMaterno = apellidoMaterno;
}

	public String getTelefono() {
	return telefono;
}

	public void setTelefono(String telefono) {
	this.telefono = telefono;
}

	public String getCelular() {
	return celular;
}

	public void setCelular(String celular) {
	this.celular = celular;
}

	public Contacto(String nombre, String apellidoPaterno, String apellidoMaterno,
		String telefono, String celular) {
	super();
	this.nombre = nombre;
	this.apellidoPaterno = apellidoPaterno;
	this.apellidoMaterno = apellidoMaterno;
	this.telefono = telefono;
	this.celular = celular;
}

}