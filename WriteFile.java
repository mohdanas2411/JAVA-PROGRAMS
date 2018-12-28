import java.io.*;
class WriteFile{
	public static void main(String[] args) throws Exception{
		FileOutputStream out = new FileOutputStream("hello.txt");
		char c[]={'a','n','a','s','a','n','s','a','r','i'};
		try{
			for (int i=0;i<c.length ;i++ ) {
				out.write(c[i]);
			}
		}
		catch(Exception e){
			System.out.print(e);
		}
	}
}