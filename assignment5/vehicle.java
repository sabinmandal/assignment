abstract class Vehicle
{
	public abstract void start();
	public void stop()
	{
		System.out.println("Vehicle Stopped");
	}
}

class TwoWheeler extends Vehicle
{
	public void start()
	{
		System.out.println("Two wheeler vehicle started");
	}
}

class FourWheeler extends Vehicle
{
	public void start()
	{
		System.out.println("Four wheeler vehicle started");
	}
}

public class Vehicle_Inher
{
	public static void main(String[] x)
	{
		TwoWheeler t = new TwoWheeler();
		FourWheeler f = new FourWheeler();
		
		t.start();
		t.stop();
		f.start();
		f.stop();
	}
}
