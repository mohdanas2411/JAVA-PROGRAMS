import java.util.*;
class LinkedHashMapDemo{
	public static void main(String[] args) {

		LinkedHashMap lhm = new LinkedHashMap();

		lhm.put(12,"A");
		lhm.put(2,"B");
		lhm.put(10,"A");   // add entry in key value pair
		lhm.put(120,"AN");
		lhm.put("Aa",10);
		System.out.println(lhm.putIfAbsent(15,"B"));  // if id not found then put this entry
		System.out.println(lhm.replace(1,"A"));       // replace with this value and return ex value
		System.out.println(lhm.replace(15,"B","C"));  // replace Ist value with IInd one return boolean 
		System.out.println(lhm.getOrDefault(10,"B")); //if this id found then return default value otherwize return pass value;
		System.out.println(lhm.containsValue(10));
		System.out.println(lhm);
	}
}