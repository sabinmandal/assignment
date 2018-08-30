import java.util.Scanner;
class Print_func
{
	public void print()
	{
		System.out.println("Null Arguments");
	}
	
	public void print(int x)
	{
		System.out.println("Integer value is " + x);
	}
	public void print(float x)
	{
		System.out.println("Float value is " + x);
	}
}

public class Print_Overload
{
	public static void main(String[] x)
	{
		int i;
		float f;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter Integer value");
		i = ip.nextInt();
		System.out.println("Enter Float value");
		f = ip.nextFloat();
		
		Print_func p1 = new Print_func();
		Print_func p2 = new Print_func();
		Print_func p3 = new Print_func();
		
		p1.print();
		p2.print(i);
		p3.print(f);
	}
}
