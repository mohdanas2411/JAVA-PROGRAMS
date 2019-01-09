import java.util.HashSet;
class HashSet_Allow_Duplicate{
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add("anas1");
		hs.add("anas2");
		hs.add("anas3");
		hs.add("anas4");

		hs.add(new Test("anas",8));  // duplicate
		hs.add(new Test("anas",8));  // duplicate 

		//for allow duplicates we overwrite hashing


		System.out.println(hs);
	}
}
class Test{
	String name;
	int id;
	Test(String name, int id){
		this.name = name;
		this.id = id;
	}
	public int hashCode(){
		return id;
	}

	public String toString(){
		return name +hashCode(); 
	}
}