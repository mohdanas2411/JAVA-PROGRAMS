class Fibonacci
{
	public static void main(String[] args) 
	{
		int x=0,y=1,z=0,i;
		System.out.print("Fibonacci series "+x+" "+y);
		for (i=0;i<10;i++) 
		{
			z=x+y;
			System.out.print(" "+z);
			x=y;
			y=z;
		}
		
	}
	
}