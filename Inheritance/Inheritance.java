 class Test
{
	void show()
	{
		System.out.println("Test");
	}
	

}
interface A{

	void show();
}



public class Inheritance extends Test implements A
{
	
	public void show(){
		System.out.println("interface");
	}
	public static void main(String[] args) 
	{
		Inheritance i = new Inheritance();
		i.show();
	
	}
}
