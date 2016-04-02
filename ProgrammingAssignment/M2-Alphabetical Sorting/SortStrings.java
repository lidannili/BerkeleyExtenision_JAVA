// declare a string array to hold the input strings 
// count user input strings

import java.io.*;

public class SortStrings{	
	public static void main(String [] args) throws IOException
	{	String[] myStringArray;
		int countInput = 0;
		int nextIndex = 0;
		//declare a string array to hold the input strings
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in), 1);
		String s = stdin.readLine();
		while(s != null){
			countInput++;
		}
		myStringArray = new String[countInput];
		if(nextIndex < myStringArray.length)
		{
			myStringArray[nextIndex] = s;
			nextIndex++;
		}
		sortStringBubble(myStringArray);
		for(int i=0; i<myStringArray.length;i++){
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