class Base
{
	Base()
	{
		System.out.println("Default Contructor is called.");
	}
	
	Base(int i){
		this();
		System.out.println("Parameterized is called and value is " + i);
	}	
}

class Calling_Constructor
{
	public static void main(String[] x)
	{
		Base b = new Base(14);
	}
}
