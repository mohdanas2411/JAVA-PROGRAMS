class FinalizeMethodCase2{
	public static void main(String[] args) {
		FinalizeMethodCase2 fn = new FinalizeMethodCase2();
		fn.finalize(); //Explicitly called its behave like a normal method.
		fn=null;  // eligible for GC.
		Runtime.getRuntime().gc(); //call GC for Destroyong it.
		System.out.println("End of Main");
	}

	public void finalize(){
		System.out.println("Explicitly called finalize method based on our requirement");
	}
}