interface A
{
	 void display();
}
public class InterfaceIntro 
{
	public void display()
	{
		System.out.print("implement interface");
	}

	public static void main(String[] args) 
	{
		InterfaceIntro I = new InterfaceIntro();
		I.display();	
	}
}