import java.util.HashMap;
import java.util.Map;
class HashMapDemo{
	public static void main(String[] args) {
		
		Map m = new HashMap();
		m.put(12,"A");
		m.put(2,"B");
		m.put(10,"A");   // add entry in key value pair
		m.put(120,"AN");
		System.out.println(m.putIfAbsent(15,"B"));  // if id not found then put this entry
		System.out.println(m.replace(1,"A"));       // replace with this value and return ex value
		System.out.println(m.replace(15,"B","C"));  // replace Ist value with IInd one return boolean 
		System.out.println(m.getOrDefault(10,"B")); //if this id found then return default value otherwize return pass value;
		System.out.println(m);


	}
}