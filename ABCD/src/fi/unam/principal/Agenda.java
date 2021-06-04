package fi.unam.principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Agenda {
	
	ArrayList<Contacto> agenda = new ArrayList<Contacto>();
	
	public void agregarContacto(Contacto c){
		agenda.add(c);
	}
	
	public void listarContactos(){
		Iterator i = agenda.iterator();
		while(i.hasNext()){
			Contacto c = (Contacto)i.next();
			System.out.println(c.getNombre().trim() + "," + c.getApellidoPaterno().trim()  + "," + c.getApellidoMaterno().trim() + "," + c.getCelular().trim() + "," + c.getTelefono().trim());
		}
	}
	
	public boolean borrarContacto(String nombre){
		Iterator i = agenda.iterator();
		int contador = 0;
		while(i.hasNext()){
			Contacto c = (Contacto)i.next();
			if(c.getNombre().toLowerCase().trim().equals(nombre.toLowerCase().trim())){
				agenda.remove(c);
				contador++;
			}
		}
		if(contador == 0)
			return false;
		else
			return true;
	}
	
	public void encontarContacto(String telefono){
		Iterator i = agenda.iterator();
		while(i.hasNext()){
			Contacto c = (Contacto)i.next();
			if(c.getTelefono().toLowerCase().trim().equals(telefono.toLowerCase().trim())){
				System.out.println(c.getNombre() + " , " + c.getApellidoPaterno()  + " , " + c.getApellidoMaterno() + " , " + c.getCelular() + " , " + c.getTelefono());
			}
		}
	}
	
	public void inicializarAgenda(String nombreArchivo, String ruta){
		BufferedReader br = null;
		FileReader fr = null;
		try{
			fr = new FileReader(ruta+nombreArchivo);
			br = new BufferedReader(fr);
			String linea = br.readLine();
			Contacto c = null;
			while(linea != null){
				String[] lp = linea.split(",");
				c = new Contacto(lp[0],lp[1],lp[2],lp[3],lp[4]);
				agregarContacto(c);
				linea = br.readLine();
			}
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException e){
			e.printStackTrace();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally
		{
			try{
				if(fr != null)
					fr.close();
				}
				catch (IOException e){
					e.printStackTrace();
				}
			}
		}

	public void cerrarAgendaArchivo(String nombreArchivo, String ruta){
		FileWriter fw = null;
		PrintWriter pw = null;
		try{
			fw = new FileWriter(ruta + nombreArchivo);
			pw = new PrintWriter(fw);
			Iterator i = agenda.iterator();
			while(i.hasNext()){
				Contacto c = (Contacto)i.next();
				pw.println(c.getNombre() + " , " + c.getApellidoPaterno()  + " , " + c.getApellidoMaterno() + " , " + c.getCelular() + " , " + c.getTelefono());
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally{
			try 
			{
				if(fw != null)
					fw.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			catch (Exception e){
				e.printStackTrace();
			}
		}
	}
}