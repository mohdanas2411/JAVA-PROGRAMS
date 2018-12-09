import java.util.Scanner;
class MidPointCircleDP
{
	int r,x,y,i=0;
		float dpk;
	void input(){

			System.out.println("Enter the value of x and y of Center of Circle");
			Scanner in = new Scanner(System.in);
			x = in.nextInt();
			y = in.nextInt();
			System.out.println("Enter the radius of Circle");
			r= in.nextInt();
		}

		void output(){
			dpk=1-r;
			y+=r;
			System.out.println(" xk=1 =  "+x+" yk-1 =  "+y);
			while(x<y)
			{
				if(dpk<0)
				{
					x=x+1;
					
					System.out.println("dp"+i+" =  "+dpk+" xk=1 =  "+x+" yk-1 =  "+y);
					i++;
					dpk=dpk+(2*x)+1;
				}
				else
				{
					x=x+1;
					y=y-1;
					
					System.out.println("dp"+i+" =  "+dpk+" xk=1 =  "+x+" yk-1 =  "+y);
					i++;
					dpk=dpk+(2*x)-(2*y)+1;
				}
			}
		}
	public static void main(String[] args) 
	{
		MidPointCircleDP obj = new MidPointCircleDP();
		obj.input();
		obj.output();
		
	}		
}