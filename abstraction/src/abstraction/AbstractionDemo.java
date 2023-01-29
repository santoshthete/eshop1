package abstraction;
abstract class Vehicle
{
	abstract void start();
	
}
class Car extends Vehicle
{
	void start()
	{
		System.out.println("start with key");
	}
}
class Scooter extends Vehicle
{
	void start()
	{
		System.out.println("start with kick");
	}
}
class AbstractionDemo
{
	public static void main (String args [])
	{
		Car ob =new Car();
		ob.start();
		System.out.println("---------------------");
		
		Scooter ob1=new Scooter();
		ob1.start();
				
	}
}