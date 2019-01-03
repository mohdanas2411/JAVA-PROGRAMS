import java.util.List;
import java.util.LinkedList;
class LinkedListDemo{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("anas");
		list.add("ansari"); 
		list.add("11"); 
		list.add("a2"); 
		list.add("a3");
		list.addFirst("mohd"); //add mohd in first of the list
		list.addLast("Engineer"); //add engineer in last of the list
		list.set(3,"hello"); //replace the value of index 3 with hello
		list.removeFirst();  // remove first element of the list
		list.removeLast();  // remove last element of the list
		list.isEmpty();
		System.out.println(list); 
	}
}