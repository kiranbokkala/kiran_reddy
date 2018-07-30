

//buffered reader


import java.io.*;
class BuffReader 
{
	public static void main(String[] args)throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int num1=Integer.parseInt(br.readLine());
		long num2=Long.parseLong(br.readLine());
		float num3=Float.parseFloat(br.readLine());
		Double num4=Double.parseDouble(br.readLine());
		
		char ch=br.readLine().charAt(0);

		String s1=br.readLine();
		Boolean b1=Boolean.parseBoolean(br.readLine());

		System.out.println("num1 is:"+num1);              
		System.out.println("num2 is:"+num2);
		System.out.println("num3 is:"+num3);
		System.out.println("num4 is:"+num4);

		System.out.println("cahr is:"+ch);

		System.out.println("string is:"+s1);
		 
		 System.out.println("boolean is:"+b1);

		
	}
}
