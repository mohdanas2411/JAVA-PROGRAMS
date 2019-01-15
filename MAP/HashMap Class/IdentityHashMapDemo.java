import java.util.*;
class IdentityHashMapDemo{
	public static void main(String[] args) {
		IdentityHashMap im = new IdentityHashMap();
		im.put(10,"B");
		im.put(10,"A");
		im.put("A","A");
		im.put(15,"A");
		System.out.println(im);
	}
}