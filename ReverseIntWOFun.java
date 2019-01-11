class  ReverseIntWOFun{
	public static void main(String[] args) {
		int[] ch = {1,2,33,46,7};
		System.out.println("before reverse ");
		for(Object o:ch){

			System.out.print(o+",");
		}

		for ( int i=0;i<ch.length/2 ;i++) {

			ch[i]=(ch[i]+ch[ch.length-i-1])-(ch[ch.length-i-1]=ch[i]);
		}
			System.out.println("");
		for(Object o:ch){
			System.out.print(o+",");
		}
	}
}