
public class TryAnidados 
{
	public static void main(String[] args) 
	{
		try
		{
			//int a = args.length;
			int a = 2;
			int b = 10 / a;
			System.out.println("a: " + a);
			
			try
			{
				if(a==1)
					a = a/(a-a);
				
				if(a==2)
				{
					int c[] = {1};
					c[42] = 99;
				}
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Índice del array fuera de los límites: " + e);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division por cero: " + e);
		}
	}
}
