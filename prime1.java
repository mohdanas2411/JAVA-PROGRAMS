import java. util. Scanner;
class prime1{
	public static void main(String[] args) {
		int i,flag=0,n;
		System.out.println("Enter the value");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		if (n==0||n==1) {
			System.out.println(n+" is not prime number");
		}
		else{
			for (i=2;i<=n/2;i++) {
				if (n%i==2) {
				System.out.println(n+" is not prime number");
				flag=1;
				break;
				}
			}
			if (flag==0) {
				System.out.println(n+" is prime number");
			}
		}
	}
}