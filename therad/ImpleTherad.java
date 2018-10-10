class A extends Thread
{
	public void run(){
		for (int i=0;i<3;i++ ) {
			System.out.println("thread from A "+i);
		}
		System.out.println("Exit from A");
	}
}
class B extends Thread
{
	public void run(){
		for (int i=0;i<3;i++ ) 
		{
			System.out.println("thread from B "+i);
		}
		System.out.println("Exit from B");
	}
}
class C extends Thread
{
	public void run(){
		for (int i=0;i<3;i++ ) 
		{
			System.out.println("thread from C "+i);
		}
		System.out.println("Exit from C");
	}
}

class ImpleTherad
{  
	public static void main(String[] args)
	{  
		new A().start();
		new B().start();
		new C().start();
	}  
} 
 