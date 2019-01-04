import java.util.Stack;
class StackDemo{
	public static void main(String[] args) {
		Stack St = new Stack();
		St.push("ANAS");
		St.push("ANAS1");
		St.push("ANAS2");
		St.push("ANAS3");
		System.out.println(St);
		St.pop();
		System.out.println(St);
		System.out.println(St.empty());  // return boolean
		System.out.println(St.peek());  //return peek object
		System.out.println(St.search("ANAS5")); //if data is present then return 1 else -1
		
	}
}