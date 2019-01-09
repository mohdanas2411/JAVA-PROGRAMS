import java.util.TreeSet;
import java.util.Comparator;

class ImpleComparatorOnString{
	public static void main(String... args){

		TreeSet ts = new TreeSet(new Decending());

		ts.add("A");
		ts.add(new StringBuffer("ANAS"));
		ts.add("Z");
		ts.add("D");
		ts.add(new StringBuffer("XYZ"));
		ts.add("C");

		System.out.println(ts);
	}
}
class Decending implements Comparator{
	public int compare(Object obj1, Object obj2){

		String s1 = obj1.toString();
		String s2 = obj2.toString();

		Integer l1 = s1.length();
		Integer l2  = s2.length();


		if (l1>l2) {
			
			return -1;
		}
		if (l1<l2) {
			
			return +1;
		}

		else{
		return -s1.compareTo(s2);
			
		}
	}
}