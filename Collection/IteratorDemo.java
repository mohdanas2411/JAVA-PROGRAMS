import java.util.Iterator;
import java.util.ArrayList;
class IteratorDemo{
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("anas");
		al.add("anas1");
		al.add("anas2");
		al.add("anas3");

		System.out.println(al);

		Iterator it = al.iterator();
		while(it.hasNext())
		{
			it.next();
			it.remove();
		}

		System.out.println(al);


	}
}