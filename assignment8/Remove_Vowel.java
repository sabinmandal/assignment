import java.util.Scanner;
public class Remove_Vowel
{
	public static void main(String[] x)
	{
		Scanner ip = new Scanner(System.in);
		String str;
		System.out.println("Enter a string");
		str = ip.nextLine();
		
		System.out.println("String when vowel are not removed : " + str);
		String str1 = str.replaceAll("[aeiouAEIOU]" , "");		
		System.out.println("String after vowel are removed : " + str1);
		ip.close();
	}
}