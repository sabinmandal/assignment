public class SubString
{
	public static void main(String[] x)
	{
		String str = "xyz";
		int k;
		System.out.println("The substring of " + str + " are :");
		for(int i=0; i<str.length(); i++)
		{
			k=i;
			for(int j=0 ; j<str.length()-i; j++)
			{
				k++;
				System.out.println(str.substring(j,k));
			}
		} 
		
	}
}