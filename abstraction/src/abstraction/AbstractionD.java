package abstraction;

 abstract class Test
{
	abstract void show();
	abstract void demo();
	
}
 class Hello extends Test
{
	void show()
	{
		System.out.println("hii");
	}
	void demo()
	{
		System.out.println("byee");
	}
}

public class AbstractionD {

	public static void main(String[] args) {
		Hello c=new Hello();
		c.demo();
		c.show();

	}

}
