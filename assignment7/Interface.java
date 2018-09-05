interface Animals{
	void speak();
	void eat();
}

class Dog implements Animals
{
	public void speak()
	{
		System.out.println("Dog barks");
	}
	public void eat(){
		System.out.println("Dog eat foods");
	}
}

class Cat implements Animals
{
	public void speak()
	{
		System.out.println("Cat meow");
	}
	public void eat()
	{
		System.out.println("Cat eat meat.");
	}
}
public class Interface 
{
	public static void main(String[] x) 
	{
		Dog d= new Dog();
		Cat c = new Cat();
		d.speak();
		d.eat();		
		c.speak();
		c.eat();
	}
}
