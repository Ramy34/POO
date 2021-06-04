
public class Multicatch 
{	
	static String cadena;
	
	public static void main(String[] args) 
	{
		try
		{
			//int a = args.length;
			int a = 0;
			System.out.println("a: " + a);
			
			int b = 42 / a;
			int c[] = {1};
			//c[42] = 99;
			
			//if(cadena != null)
			System.out.println("Longitud: " + cadena.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division por cero: " + e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Índice del array: " + e);
		}
		catch(NullPointerException npe)
		{
			System.out.println("cadena nula");
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("Después de los bloques try/catch");
	}

}
