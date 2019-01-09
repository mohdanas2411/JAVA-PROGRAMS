import java.util.TreeSet;
import java.util.Comparator;

class CustomSortByNameNdId{

	 public static void main(String[] args) {

		TreeSet ts1 = new TreeSet(new SortByName());

		ts1.add(new customSort(10,"ANAS"));
		ts1.add(new customSort(15,"SAN"));
		ts1.add(new customSort(8,"PSA"));
		ts1.add(new customSort(20,"FLY"));
		
		System.out.println("Sort in Decending Order"+ts1);	
	}
}

class customSort implements Comparable{
	int no;
	String name;
	customSort(int no,String name){
		this.no=no;
		this.name=name;
	}
	public int compareTo(Object o){
		customSort s1 = (customSort)o;
		return -s1.name.compareTo(this.name); 
	}
	public String toString(){
		return this.no+" "+this.name;
	}
}
class SortByName implements Comparator{
	public int compare(Object obj1,Object obj2){

		customSort s1 = (customSort)obj1;
		customSort s2 = (customSort)obj2;

		if (s1.name.length()<s2.name.length()) {
			
			return +1;
		}
		if (s1.name.length()>s2.name.length()) {
			
			return -1;
		}
		else
			return -s1.name.compareTo(s2.name);

	}
}

class SortByNo implements Comparator{
	public int compare(Object obj1,Object obj2){

		customSort i1 = (customSort)obj1;
		customSort i2 = (customSort)obj2;

		if (i1.no<i2.no) {

			return +1;
		}
		if (i1.no>i2.no) {

			return -1;
		}
		else
			return 0;

	}
}