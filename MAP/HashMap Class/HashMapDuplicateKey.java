import java.util.*;
class HashMapDuplicateKey{
	public static void main(String[] args) {
		HashMap hm = new HashMap();

		hm.put(new DuplicKey(10),200);
		hm.put(new DuplicKey(10),500);
		hm.put(new DuplicKey(10),100);
		hm.put(new DuplicKey(10),5100);
		hm.put(new DuplicKey("a"),5050);
		hm.put(new DuplicKey("a"),5040);
		System.out.println(hm);
	}
}
class DuplicKey{
	Object key;
	DuplicKey(Object key){
		this.key=key;
	}
	public boolean equals(Object o){
		return false;
	}
	public String toString(){
		return key+"";
	}
	public int hashCode(){
		return 1;
	}
}