class Prime{
	
	public static void main(String[] args) {
		int n=30;
		int flag=0;
		for (int i=n-1;i>2;i--)
		{
			if (n%i==0) {
				flag=0;
			}
			else{
				flag = 1;
			}
		}
		if (flag==1) {
			System.out.print("yes");
		}
		else{
			System.out.print("not");
		}
	}
}