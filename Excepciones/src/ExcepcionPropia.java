
public class ExcepcionPropia extends Exception
{
	private int detalle;
	
	ExcepcionPropia(int a)
	{
		detalle = a;
	}
	
	public String toString()
	{
		return "Mi excepcion [" + detalle + "]";
	}
}