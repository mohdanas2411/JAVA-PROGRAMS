import java.util.LinkedHashSet;
class LinkedHashSetDemo{
	public static void main(String[] args) {
		LinkedHashSet ls = new LinkedHashSet();
		LinkedHashSet ls1 = new LinkedHashSet();

		ls.add("anas"); 
		ls.add("anas1"); 
		ls.add("anas2"); 
		ls.add("anas3");  // insertion order preserved 
		ls.add("anas4"); 
		ls.add("anas5"); 

		ls.add("anas6");  // duplicate not allowed
		ls.add("anas6"); 

		System.out.println(ls);

		ls.add(new Test("anas",2411));  // duplicate allowed 
		ls.add(new Test("anas",2411));

		System.out.println(ls);

		System.out.println(ls.getClass());

		System.out.print(ls.equals(ls1));


	}
}

class Test{
	String inName;
	int no;
	Test(String inName, int no){
		this.inName = inName;
		this.no = no;
	}

	public int hashCode(){
		return no;
	}

	public String toString(){
		return inName+hashCode()+"custom";
	}

}