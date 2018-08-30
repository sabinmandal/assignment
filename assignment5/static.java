class func 
{
    static 
	{
        System.out.println("Static block is called automatically");
    }
}
 
public class STATIC {
    public static void main(String[] x) {
 
       func f = new func();
    }
}
