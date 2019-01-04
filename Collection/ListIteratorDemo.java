import java.util.ListIterator;
import java.util.ArrayList;
class ListIteratorDemo{
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("AAA");
		al.add("AAACV");
		al.add("AAADD");
		System.out.println(al);

		ListIterator li = al.listIterator();

		li.add("add by List iterator");
		System.out.println(al);

		while(li.hasNext()){
			li.next();
			li.remove();
		}
		System.out.println(al);	

		while(li.hasPrevious()){
			li.previous();
			li.remove();
			System.out.println(al);	
		}

	}
}