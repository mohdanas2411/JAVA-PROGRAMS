import java.util.*;
class HashMapUniqueValue{
	public static void main(String[] args) {
		HashMap hm = new HashMap();

		hm.put("A",new UniqueValue(10));
		hm.put("Aa1",new UniqueValue(10));
		hm.put("A14",new UniqueValue(10));
		hm.put("A14",new UniqueValue(10));
		System.out.println(hm);
	}
}
class UniqueValue{
	Object value;
	UniqueValue(Object value){
		this.value=value;
	}
	public boolean equals(Object o){
		return true;
	}
	public String toString(){
		return value+"";
	}
	public int hashCode(){
		return 1;
	}
}