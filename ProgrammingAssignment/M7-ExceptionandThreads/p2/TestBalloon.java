//Define a class representing an inflatable balloon. 
//Balloon should have a method inflate( ) (which can be called many times) and a maximum inflation pressure. 
//It should act appropriately if the Balloon is overinflated. 
//Since Balloon is a proper Java class, it shouldn't be possible to change the pressure without calling inflate( )!
import java.io.*;

class Balloon
{
	private float pressure;
	public float getPressure()
	{
		return pressure;
	}
	public void setPressure(float p)
	{
		pressure = p;
	}
	
	private float pr_max;
	public float getMaxPressure()
	{
		return pr_max;
	}
	public void setMaxPresure(float mp)
	{
		pr_max = mp;
	}
	public static int count = 0;

	public void inflate()
	{
		try
		{
			while(this.pressure < this.pr_max )
			{
				pressure += 5;
				count++;
			}

		System.out.print("Final pressure of the baloon is: ");
	    System.out.println(pressure);
	   	System.out.print("Inflate times:");
	   	System.out.println(count); 
			
		}
		catch(Exception ex)
		{
			System.out.println("Warning: Reached maximum pressure.Please stop inflating!");
		}
	}
}

public class TestBalloon{
	public static void main(String[] args) throws IOException
    {
    	Balloon balloon = new Balloon();
    	balloon.setPressure(20);
    	balloon.setMaxPresure(40);
    	balloon.inflate();  

    }	
}
	
