
import java.util.*;
public class Count_Words
{
	public static void main(String[] x)
	{
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter string ");
		String str;
		str = ip.nextLine();
		int c = 1;
		for(int i=0 ; i<str.length() ; i++ )
		{
			if( (str.charAt(i) == ' ') && (str.charAt(i+1) != ' ' ) )
			{
				c++;
			}
		}
		
		System.out.println("Number of words in a string is " + c);
		ip.close();
	}
}