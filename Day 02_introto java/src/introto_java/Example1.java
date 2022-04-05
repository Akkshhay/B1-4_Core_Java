package introto_java;
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		s.close();
		

	}

}
