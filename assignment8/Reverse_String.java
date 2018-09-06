
import java.util.Scanner;

public class Reverse_String
{
	public static void main(String[] x)
	{
		String str1;
		String str2 = "";
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter String");
		str1 = ip.nextLine();
		int i , len;
		len = str1.length();
		
		System.out.println("String before reversed : " + str1);
		
		for(i=len-1 ; i>=0 ; i-- )
		{
			str2 = str2 + str1.charAt(i);
		}
		
		System.out.println("String after reversed : " + str2);
		ip.close();
	}
}