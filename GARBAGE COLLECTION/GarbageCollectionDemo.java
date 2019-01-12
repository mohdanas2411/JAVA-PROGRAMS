class GarbageCollectionDemo{
	static Runtime r = Runtime.getRuntime();

	public void check(){
		System.out.println("Total Memory :"+r.totalMemory());
		System.out.println("Before Execution Free Memory :"+r.freeMemory());
		for (int i=0;i<10000000 ;i++ ) {
			GarbageCollectionDemo gts = new GarbageCollectionDemo();
			gts = null;
		}
		System.out.println("After Execution Free Memory :"+r.freeMemory());
	}

	public static void main(String[] args) {
		GarbageCollectionDemo gt = new GarbageCollectionDemo();
		gt.check();
		System.out.println("Call Garbage Collector :");
		r.gc();
		System.out.println("Free Memory After call GC:"+r.freeMemory());
	}
}