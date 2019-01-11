class ReverseCharWOFun{
	public static void main(String[] args) {
		char[] ch = {'m','o','h','d','a','n','a','s'};
			System.out.println("before reverse ");
		for(Object o:ch){

			System.out.print(o+",");
		}

		for ( int i=0;i<ch.length/2 ;i++) {
			char temp,temp1;
			temp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
		}
			System.out.println("");
		for(Object o:ch){
			System.out.print(o+",");
		}
	}
}