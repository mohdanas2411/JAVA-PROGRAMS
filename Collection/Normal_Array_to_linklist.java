import java.util.*;
public class Normal_Array_to_linklist{
	public static void main(String[] args) {
		
		String[] arr = {"anas","ansari"};
		ArrayList li = new ArrayList(Arrays.asList(arr));
		LinkedList list = new LinkedList(li);
		System.out.println(list);
	}
} 