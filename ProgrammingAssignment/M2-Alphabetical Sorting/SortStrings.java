import java.io.*;

public class SortStrings{	
	public static void main(String [] args) throws IOException
	{	
		//declare a string array to hold the input strings
		String[] myStringArray;
		int size = 0;

		System.out.print("Number of Strings in the array: ");
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in), 1);
		String s = stdin.readLine();
		size = Integer.parseInt(s);

		myStringArray = new String[size];

		for(int i=0; i<size;i++){
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in), 1);
			String inputLine = is.readLine();
			myStringArray[i] = inputLine;
		}

		//call the bubblesort method to sort the string array alphabetically
		sortStringBubble(myStringArray);
		System.out.println("The sorted array is: ");

		//print out the sorted array
		for(int i=0; i<size;i++){
			System.out.println(myStringArray[i]);
		}	
	}


	public static void sortStringBubble(String x[])
	{
		int j;
		boolean flag = true; //determine when the sort is finished
		String temp;

		while(flag)
		{
			flag = false;
			for(j=0; j<x.length - 1; j++)
			{
				if(x[j].compareToIgnoreCase(x[j+1])>0) 
				//returning a positive integer if the current object is greater than the argument, respectively.
				{
					temp = x[j];
					x[j] = x[j+1];
					x[j+1] = temp;
					flag = true;
				}
			}

		}
		
	}
}