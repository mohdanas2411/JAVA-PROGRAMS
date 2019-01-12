class FinalizeMethodCase3{
	static FinalizeMethodCase3 fn1;
	public static void main(String[] args)throws InterruptedException {
		FinalizeMethodCase3 fn = new FinalizeMethodCase3();
		System.out.println("fn object hashcode "+fn.hashCode());
		fn=null;
		System.gc(); // call finalize method only 1 time for 1 object
		Thread.sleep(5000);

		System.out.println("fn1 object hashcode "+fn1.hashCode());
		fn1=null;
		System.gc(); // not call finalize because its refrence is same with fn and its finalize is already called 
		Thread.sleep(2000);
		System.out.println("End of main");
	}

	public void finalize(){
		System.out.println("finalize method called");
		fn1 = this;
		
	}
}