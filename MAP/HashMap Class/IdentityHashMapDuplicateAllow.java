import java.util.*;
class IdentityHashMapDuplicateAllow{
	public static void main(String[] args) {
		IdentityHashMap im = new IdentityHashMap();
		im.put(new Student(10),"B");
		im.put(new Student(10),"A");
		im.put("A","A");
		im.put(15,"A");
		im.put(15,"AA");
		System.out.println(im);
	}
}
class Student{
	int i;
	Student(int i){
		this.i=i;
	}
	public String toString(){
		return i+"";
	}
	public int hashCode(){
		return 10;
	}
	public boolean equals(Object o){
		return false;
	}
}