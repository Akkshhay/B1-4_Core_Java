package oops;

public class Non_parametarize
{
	String str;
	int a;
	Non_parametarize()
	{
		str="akshay";
		a=1010;
	}
	void display()
	{
		System.out.println(str+" "+a);
		
	}
	

	public static void main(String[] args) {
		Non_parametarize c=new Non_parametarize();
		c.display();
	}

}
