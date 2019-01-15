import java.util.*;
class TreeMapImpleComparable{
	public static void main(String[] args) {
		TreeMap tm =new TreeMap();
		// tm.put(new decendingc(5),5);
		System.out.println(new decendingc(5));
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
		
class decendingc implements Comparable{
	int i1;
	decendingc(int i1){
		this.i1=i1;
	}
	public int compareTo(Object o){

		Integer i2 = (Integer)o;
		
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
	public String toString(){
		return i1+"";
	}
}