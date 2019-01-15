import java.util.*;
class TreeMapImpleIterator{
	public static void main(String[] args) {
		TreeMap tm =new TreeMap();

		tm.put(10,20);
		tm.put(11,"A");
		tm.put(12,"B");
		tm.put(9,"A");

		Set s1 = tm.keySet();
		Collection c1 = tm.values();
		Set s2 = tm.entrySet();

		System.out.println(s1+"all keys");
		System.out.println(c1+"all values");
		System.out.println(s2+"entry set");

		Iterator i = s2.iterator();

		while(i.hasNext()){
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey()+"key"+"------"+me.getValue()+"value");
		}
	}
}
