import java. util. Scanner;
class oddeven{
	public static void main(String[] args) {
		int x;
		System.out.println("Enter a number");
		Scanner in = new Scanner (System.in);
		x = in.nextInt();

		if (x%2==0) {
			System.out.println(x+" is a even number");
		}
		else	System.out.println(x+" is a odd number");
		
	}
}