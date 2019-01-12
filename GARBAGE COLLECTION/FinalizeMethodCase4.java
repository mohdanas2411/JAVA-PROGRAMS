class FinalizeMethodCase4{
	public static void main(String[] args) {
		FinalizeMethodCase4 fn = new FinalizeMethodCase4();
		// fn.finalize(); //explicitly called finalize method.
		fn=null;
		System.gc(); // normally terminate even if finalize method have uncaught exception.
		System.out.println("END of Main");
	}

	public void finalize(){
		System.out.println("finalize method called");
		System.out.println(10/0);  // uncaught exception with out try catch block. Program abnormally terminate.If finalize called by GC then it terminate normally.
	}
}