package fi.unam.io;
import java.util.Scanner;
import fi.unam.principal.Agenda;
import fi.unam.principal.Contacto;

public class Menu {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Agenda agenda = new Agenda();
		String nombreArchivo = "archivo.txt";
		String ruta = "E:\\";
		agenda.inicializarAgenda(nombreArchivo,ruta);
		int opcion;
		String nom, ap, am, tel, cel;
		do{
			System.out.println("*** Men� ***\n1. A�adir\n2. Listar\n3. Borrar\n4. Buscar\n5. Salir");
			opcion = teclado.nextInt();
			switch(opcion){
			case 1:
				System.out.println("Ingresa el nombre");
				nom = teclado.next();
				System.out.println("Ingresa el apellido paterno");
				ap = teclado.next();
				System.out.println("Ingresa el apellido materno");
				am = teclado.next();
				System.out.println("Ingresa el celular");
				cel = teclado.next();
				System.out.println("Ingresa el tel�fono de casa");
				tel = teclado.next();
				Contacto c = new Contacto(nom,ap,am,cel,tel);
				agenda.agregarContacto(c);
				break;
			case 2:
				agenda.listarContactos();
				break;
			case 3:
				System.out.println("Ingresa el nombre");
				nom = teclado.next();
				if(agenda.borrarContacto(nom)){
					System.out.println("Contactos borrados");
				}
				else
					System.out.println("Contacto(s) no encontrado(s)");
				break;
			case 4:
				System.out.println("Ingresa el tel�fono de casa");
				tel = teclado.next();
				agenda.encontarContacto(tel);
				break;
			case 5:
				System.out.println("�dios");
				agenda.cerrarAgendaArchivo(nombreArchivo, ruta);
				break;
			default:
				System.out.println("Error: Opci�n no v�lida");
		}
	}
	while(opcion != 5);
	}
}