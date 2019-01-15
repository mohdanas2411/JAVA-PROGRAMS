import java.util.*;
class TreeMapImpleComparator{
	public static void main(String[] args) {
		TreeMap tm =new TreeMap(new decending());

		tm.put(10,20);
		tm.put(11,"A");
		tm.put(12,"B");
		tm.put(9,"A");

		// Set s1 = tm.keySet();
		// Collection c1 = tm.values();
		// Set s2 = tm.entrySet();

		// System.out.println(s1+"all keys");
		// System.out.println(c1+"all values");
		// System.out.println(s2+"entry set");
		System.out.println(tm);
	}
}
		
class decending implements Comparator{
	
	public int compare(Object o,Object o1){

		Integer i1 = (Integer)o;
		Integer i2 = (Integer)o1;

		if (i1<i2) {

			return +1;
		}
		if (i1>i2) {
			
			return -1;
		}
		else{
			return 0;
		}
	}
}