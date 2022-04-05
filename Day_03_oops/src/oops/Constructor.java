package oops;

public class Constructor
{
	String str;
	int a;
	Constructor(String st,int x)
	{
		str=st;
		a=x;
	}
	void display()
	{
		System.out.println(str+" "+a);
		
	}
	public static void main(String[] args) {
		Constructor c=new Constructor("akshay",100);
		c.display();

}

}
