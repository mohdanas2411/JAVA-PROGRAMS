class Reverse
{
	public static void main(String[] args) 
	{
		int num=12345,revers;
		System.out.print("After reverse number is ");
		do{
			revers=num%10;
			System.out.print(revers);
			num=num/10;
		}while(num>0);

	}
}