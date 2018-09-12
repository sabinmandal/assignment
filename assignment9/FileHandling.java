import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileHandling
{
	public static void main(String[] x)
	{
		File f = new File("C:/Users/Inspiron-3421/Desktop/Java/Filehandling/abc.txt");
		try
		{ 
			FileInputStream fin = new FileInputStream(f);
			int i;
			System.out.println("Contents of file is :");
			i = fin.read();
			while( i != -1 )
			{
				System.out.print((char)i + " ");
				i = fin.read();
			}
			fin.close();
		}
		
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		System.out.println("File path : " + f.getPath());
		}
}
