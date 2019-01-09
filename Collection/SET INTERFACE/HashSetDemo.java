import java.util.HashSet;
class HashSetDemo{
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("anas1");
		hs.add("anas2");  // insertion order is not preserved
		hs.add("anas3");
		hs.add("anas4");
		hs.add("anas5");
		hs.add("anas");
		hs.add("anas");  // duplicate value not allowed then not add
		System.out.println(hs);
		System.out.println(hs.isEmpty());
	}
}




