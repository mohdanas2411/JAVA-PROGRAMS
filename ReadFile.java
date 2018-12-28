import java.io.*;
class ReadFile{
	public static void main(String[] args) throws Exception{
		FileInputStream in = new FileInputStream("hello.txt");
			try{
				int c;
				while((c = in.read()) != -1){
					System.out.print((char)c);
				}
			}
			catch(Exception e)
			{
				System.out.print(e);
			}
		}
}