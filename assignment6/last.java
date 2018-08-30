final class Demo
{
	private String str;
	Demo(String s)
	{
		str = s;
	}
	
	void display()
	{
		System.out.println(str);
	}
}
 
class Last_Class
{
	public static void main(String[] x)
	{
		Demo d = new Demo("Class cannot be extended further.");
		d.display();
	}
}
