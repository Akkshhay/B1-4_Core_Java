package lambdaexpression;
interface A
{
	void show();
}
/*class Xyz implements A
{
	public void show()
	{
		System.out.println("Welcome to Lambda Expression");
	}
}*/
public class lambda1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=()->
		    {
				System.out.println("Welcome to Lambda Expression");
			};
			obj.show();
	}

}
