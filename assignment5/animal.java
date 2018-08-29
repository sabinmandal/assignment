
abstract class Animal
{
	private String breed , colour;
	Animal(String b , String c)
	{
		breed = b;
		colour = c;
	}
	public String getBreed()
	{	
		return breed;
	}	
	public String getColour()
	{
		return colour;
	}	
	public abstract void speak();

}

class Dog extends Animal
{
	Dog(String breed , String colour)
	{
		super(breed,colour);
	}
		public void speak()
	{
		System.out.println("Dog breed is " + getBreed() + " and its colour is " + getColour());
	}		
}
	
class Cat extends Animal
{
	Cat(String breed , String colour)
	{
		super(breed,colour);
	}
	public void speak()
	{
		System.out.println("Cat breed is " + getBreed() + " and its colour is " + getColour());
	}		
}

class Animal_Inher
{
	public static void main(String[] x)
	{
		Dog d = new Dog( "Tibetan Mastiff" , "Brown" );
		Cat c = new Cat( "Korat","Black" );
		d.speak();
		c.speak();
	}
}
