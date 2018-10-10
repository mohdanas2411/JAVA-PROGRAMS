class Sum
{
	int a=10;
}
public class Inheritance_intro extends Sum
{
	int b=10;
	public void show()
	{
		int sum;
		sum=a+b;
		System.out.println("sum is "+sum);
	}
	public static void main(String[] args) 
	{
		Inheritance_intro s= new Inheritance_intro();
		s.show();
	}
}