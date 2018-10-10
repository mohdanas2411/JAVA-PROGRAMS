public class Create_object
{
	int i=10;
	public void show()
	{
		System.out.println("inside show");
	}
	static public void main(String... ar)
	{
		Create_object t= new Create_object();
		Create_object t1= new Create_object();
		Create_object t2= new Create_object();
		Create_object t3= new Create_object();
		t.show();
		System.out.println(t);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}
}