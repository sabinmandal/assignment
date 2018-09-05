import java.util.Scanner;
public class Conversion 
{
	public static void main(String[] x) 
	{		
			Scanner ip = new Scanner(System.in);
			System.out.println("Enter String");
			String str1 = ip.nextLine();
			String str2 = ip.nextLine();
			int a = Integer.parseInt(str1);
			int b = Integer.parseInt(str2);
			System.out.println(a > b ? (a + " is greater than " + b ) : (b + " is greater than " + a));
			ip.close();
	}

}
