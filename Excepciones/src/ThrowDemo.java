
public class ThrowDemo 
{
	static void metodo() //throws NullPointerException
	{
		throw new NullPointerException("demo");
		/*try
		{
			NullPointerException npe = new NullPointerException();
			//throw new NullPointerException("demo");
			throw npe;
		}
		catch(NullPointerException e)
		{
			System.out.println("Capturada desde el metodo ...");
			throw e;
		}*/
	}
	
	public static void main(String[] args) 
	{
		//metodo();
		try
		{
			metodo();
		}
		catch(NullPointerException e)
		{
			System.out.println("Recapturada: " + e);
		}
	}
}
