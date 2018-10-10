import java. util. Scanner;
class add{
	public static void main(String[] args) {
		int x,y,sum;
		System.out.println("Enter two numbers");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();

		sum=x+y;
		System.out.println("sum of two numbers is "+sum); 
	}
}