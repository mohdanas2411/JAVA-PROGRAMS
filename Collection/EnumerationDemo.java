import java.util.Enumeration;
import java.util.Vector;
class EnumerationDemo{
	public static void main(String[] args) {
		Vector vee = new Vector();
		vee.add("A");
		vee.add("AB");
		vee.add("ABC");
		vee.add("ABCD");
		System.out.println(vee);


		Enumeration en = vee.elements();


		while(en.hasMoreElements()){
			
			System.out.println(en.nextElement());
		}
		
	}
}