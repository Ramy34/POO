
public class DivisionEntreCeroManejada 
{
	public static void main(String[] args) 
	{
		int a, d;
		try
		{
			d=0;
			a=10/d;
			System.out.println("Esto no se imprimir�");
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
			ae.getMessage();
			//System.out.println(ae);
			System.out.println("Divisi�n entre cero");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Algun otro error");
		}
		
		System.out.println("Despu�s del bloque catch ...");
	}

}
