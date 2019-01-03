import java.util.ArrayList;
class ArrayListToArray{
	public static void main(String[] args) {
		ArrayList li = new ArrayList();
		li.add("anas");
		li.add("anas1");
		li.add("anas2");
		System.out.println(li);

		Object o[] = li.toArray();
		for(Object p:o)
		System.out.println(p.toString());
	}
}
