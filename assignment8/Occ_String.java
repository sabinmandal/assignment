import java.util.*;
public class Occ_String
{
	public static void main(String[] x)
	{
		Scanner ip = new Scanner(System.in);
		String str1 , str2;
		System.out.println("Enter both string");
		str1 = ip.nextLine();
		str2 = ip.nextLine();
		int flag = 0 ;
		for(int i=0 ; i<str1.length() ; i++ )
		{
			if( str1.charAt(i) == str2.charAt(0) )
			{
				int k = i;
				for(int j=0 ; j<str2.length() ; j++ )
				{
					if( str1.charAt(k) == str2.charAt(j) )
					{
						flag = 1;
						k++;
					}
					else{
						flag = 0;
						break;
					}
				}
			}
		}
		
		if( flag == 1)
		{
			System.out.println("True : There is a occurence of " + str2 + " in " + str1 );
		}
		else{
			System.out.println("False : There is no occurence of " + str2 + " in " + str1 );
		}
		ip.close();
	}
}