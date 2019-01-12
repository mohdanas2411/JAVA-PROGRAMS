class FinalizeMethodCase1{
	public void finalize(){
		System.out.println("Our class finalize method");
	}
	public static void main(String[] args) {
		FinalizeMethodCase1 fn = new FinalizeMethodCase1();
		String s1 = new String("ANAS");
		s1=null; //this object is eligible for destroying but when garbage collector destroy it then Object class finalize method executed.

		fn=null; //this object is eligible for destroying but when garbage collector destroy it then our class finalize method executed.
		
		Runtime.getRuntime().gc();
		System.out.println("END");

	}
}