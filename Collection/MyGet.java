import java.util.*;
class MyGetandMySet{
	public static void main(String[] args) {
		ArrayList arr = new ArrayList(5);
		arr.set(2,"Anas");
		arr.set(1,1998);

		System.out.println(arr.get(2));
		System.out.println(arr.get(1));
	}
}