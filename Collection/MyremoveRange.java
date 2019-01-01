import java.util.*;
public class MyremoveRange extends ArrayList <String>{
	public static void main(String[] args) {
		MyremoveRange obj = new MyremoveRange();
		obj.add("mohd");
		obj.add("Anas");
		obj.add("A1");
		obj.add("Ansari");
		obj.add("mohd");
		obj.removeRange(1,4);
		System.out.print(obj);
	}
}