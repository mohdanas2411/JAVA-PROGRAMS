import java.util.ArrayList;
import java.util.Stack;
class ArrayListToStack{
	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		Stack st = new Stack();

		al.add("A1");
		al.add("A2");
		al.add("A3");
		al.add("A4");
		al.add("A5");
		al.add("A6");

		for(Object o:al){  //get one element from arraylist in Object o

			System.out.println(o);
			st.push(o);
		}
		System.out.println(st.pop());
		System.out.println(st.peek());
	}
}