import java.io.*;
import java.util.Scanner; 

 class Init{
	
	private static void crearRepositorio(){
		String repositorio="E:\\";

		System.out.println("que nombre le pondras a tu repositorio?");	
		Scanner sc =new Scanner(System.in);
		String x= sc.nextLine();
		File repo=new File (repositorio + x);
		if(repo.exists()){
			System.out.println("El repositorio ya existe, cambia el nomre de tu repositorio");
		}
		else{
			if(repo.mkdirs()){
				System.out.println("Se creo tu nuevo repositorio");
			}
		}
	
	}
	public static void main(String[] args) {
		crearRepositorio();
		
	}

}