class MakeEligibleForGC{
	int i;
	public void doStuff(){
		MakeEligibleForGC mk1 = new MakeEligibleForGC();  // in method 3rd way
	}
	public static void main(String[] args) {
		MakeEligibleForGC mk = new MakeEligibleForGC();
		mk=null; // 1st way
		mk = new MakeEligibleForGC(); // reassign 2nd way
		mk.doStuff();
		MakeEligibleForGC obj1 = new MakeEligibleForGC();
		MakeEligibleForGC obj2 = new MakeEligibleForGC();
		MakeEligibleForGC obj3 = new MakeEligibleForGC();

		obj1.i = obj2;
		obj2.i = obj3;
		obj3.i = obj1;

		obj1=obj2=obj3=null; // 4th way island of isolation


	}
}