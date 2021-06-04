package buscaminas.personas;

import java.util.Scanner;

import buscaminas.exception.ExceptionNombre;

public class Usuario {
	private String nombreUsuario;
	Scanner teclado = new Scanner(System.in);

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public Usuario(String nombreUsuario) {
		super();
		this.nombreUsuario = nombreUsuario;
	}
	
	public boolean validarUsuario(){
		try{
		    for(int i = 0; i < nombreUsuario.length(); i++){
			    if(Character.isLetter(nombreUsuario.charAt(i)) == false){
				    throw new ExceptionNombre(nombreUsuario);
			    }
		    }
		}
		catch(ExceptionNombre e){
			System.out.println(e);
			nombreUsuario = teclado.next();
			validarUsuario();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
}