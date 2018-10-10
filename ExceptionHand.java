public class ExceptionHand
{
	static int a=50;
	static int b=0;
	public static void main(String[] args) {
		try
		{
			int res;
			res=a/b;
			System.out.println("result is "+res);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
			System.out.print("Exception is handled");
		}
	}
	
}