import java.util.*;
class TreeMapDemo{
	public static void main(String[] args) {
		TreeMap tm =new TreeMap();

		tm.put(10,20);
		tm.put(11,"A");
		tm.put(12,"B");
		tm.put(9,"A");
		System.out.println(tm.firstKey()+" firstKey");
		System.out.println(tm.lastKey()+" lastKey");
		System.out.println(tm.lowerKey(11)+" lowerKey");	// return lower than passing key not found return null
		System.out.println(tm.higherKey(12)+" higherKey ");  // return greter than passing key not found return null
		System.out.println(tm.floorKey(11)+" floorKey");    // return passing key lower than not found return null
		System.out.println(tm.ceilingKey(9)+" ceilingKey");  // return passing key higher than not found return null
		System.out.println(tm.headMap(10)+" going to head side "); // return all element which comes before passing key exclude passing para
		System.out.println(tm.tailMap(10)+" going to tail side "); // return all element which comes after passing key include passing para
		System.out.println(tm.subMap(10,12)+" between range "); // return all element which comes between passing key include passing Ist para
		System.out.println(tm);
	}
}