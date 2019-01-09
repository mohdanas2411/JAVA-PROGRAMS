import java.util.TreeSet;
import java.util.Comparator;

class ImpleComparatorIntDecen{
	
	public static void main(String[] args){

		TreeSet ts = new TreeSet( new DecendingOrder());

		ts.add(10);
		ts.add(1);
		ts.add(15);

		System.out.println(ts);
	}
}

class DecendingOrder implements Comparator{
	public int compare(Object obj1, Object obj2){

		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;

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