import java.util.Vector;
class VectorDemo{
	public static void main(String... args)
	{
		Vector ve = new Vector();
		ve.addElement("Anas");  
		ve.addElement("Anas1");  
		ve.addElement("Anas2");  
		ve.add("anasri");
		ve.add("anasri1");
		ve.add("anasri2");
		System.out.println(ve);
		
		ve.remove(2);
		System.out.println(ve);
		
		System.out.println(ve.hashCode());
		
		ve.setElementAt("ALI",2);
		System.out.println(ve);
		
		ve.insertElementAt("3422",3);
		System.out.println(ve);
		
		ve.removeAllElements();
		System.out.println(ve);

	}
}