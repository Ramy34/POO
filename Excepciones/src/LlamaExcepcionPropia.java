
public class LlamaExcepcionPropia 
{
	static void compute(int a) throws ExcepcionPropia
	{
		System.out.println("Ejecuta método compute ...");
		
		if(a > 10)
			throw new ExcepcionPropia(a);
		
		System.out.println("Finalización normal ...");
	}
	
	public static void main(String[] args) 
	{
		try
		{
			compute(1);
			compute(20);
		}
		catch(ExcepcionPropia e)
		{
			System.out.println("Captura " + e);
		}
	}
}
