
public class ThrowsDemo 
{
	static void metodo() throws IllegalAccessException
	{
		IllegalAccessException obj = new IllegalAccessException("demo");
		throw obj;	
	}
	
	public static void main(String args[])
	{
		//metodo();
		try
		{
			metodo();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("capturada ..." + e);
		}
	}
}
