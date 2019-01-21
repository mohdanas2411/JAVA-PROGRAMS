import java.util.Hashtable;
class HashTableDemo {
	public static void main(String[] arhs){
		Hashtable ht = new Hashtable();
		ht.put(new hash(3),"67");
		ht.put(new hash(3),"34");
		ht.put(new hash(3),"AA");
		ht.put(new hash(3),89);
		ht.put(new hash(3),"anas");
		System.out.println(ht);
	}
}

class hash{
	int i;
	hash(int i){
		this.i=i;
	}
	public String toString(){
		return i+"";
	}
}