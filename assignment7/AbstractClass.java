abstract class Animal
{
	private String color;
	private String breed;
	private String name;
	Animal(String color , String breed , String name)
	{
		this.color = color;
		this.breed = breed;
		this.name = name;
	}
	
	abstract void eat();
	void speak(){
		System.out.println("My cow is "+name+" and her color is "+color +" and breed is " + breed);
	}
	
}

class Cow extends Animal
{
	Cow(String color , String breed , String name)
	{
		super(color,breed,name);
	}
	void eat()
	{
		System.out.println("Cow eat grass");
	}
}
public class AbstractClass 
{
	public static void main(String[] x) 
	{
		Cow d = new Cow("Orange", "Jersey", "Mindum");
		d.speak();
		d.eat();
}
}
