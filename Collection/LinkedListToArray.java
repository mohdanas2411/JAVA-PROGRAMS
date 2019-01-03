import java.util.LinkedList;
class LinkedListToArray{
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add("anas");
		li.add("anas1");
		li.add("anas2");
		System.out.println(li.peekFirst());

		Object o[] = li.toArray(); // using this method we can convert any list to an array;
		for(Object p:o)	
		System.out.println(p.toString());
	}
}
