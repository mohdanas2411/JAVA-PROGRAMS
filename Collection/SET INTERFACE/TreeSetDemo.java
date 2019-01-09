import java.util.TreeSet;
class TreeSetDemo{
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();

		ts.add(10);
		ts.add(3);
		ts.add(5);
		ts.add(12);
		ts.add(13);
		ts.add(9);
		ts.add(10);
		System.out.println(ts);

		System.out.println(ts.first());  //TreeSet method return first object

		System.out.println(ts.last());  //TreeSet method return last object

		System.out.println(ts.higher(10));  // NavigableSet interface method return only grater than parameter if not found then return null.

		System.out.println(ts.lower(5));    // NavigableSet interface method return only smaller than parameter if not found then return null.

		System.out.println(ts.ceiling(14));  // NavigableSet interface method return grater or equal to the parameter if not found then return null. 

		System.out.println(ts.floor(7));     // NavigableSet interface method return smaller or equal to the parameter if not found then return null. 
	
		System.out.println(ts.pollFirst());  // NavigableSet interface method return first element in the set and delete it.

		System.out.println(ts.pollLast());   // NavigableSet interface method return last element in the set and delete it.

		System.out.println(ts.headSet(12));  // SortedSet Interface Method return all value which comes before passing parameter.

		System.out.println(ts.tailSet(9));  // SortedSet Interface Method return all value which comes after passing parameter and include passing parameter.
		
		System.out.println(ts.subSet(5,12));  // SortedSet Interface Method return all value which comes between passing parameter and include firdt passing parameter other one exclude.

		System.out.println(ts);

		ts.clear(); // clear all

		System.out.println(ts);
	}
}