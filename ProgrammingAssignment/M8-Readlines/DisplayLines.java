import java.io. *;
import java.util. *;

class DisplayLines 
	{
		public static void main (String[] args)
		{
			try
			{
				File myFile = new File("MyText.txt");
				FileReader fileReader = new FileReader(myFile); 
				//A FileReader is a connection stream for characters, that connects to a text file
		
				LineNumberReader  lnReader = new LineNumberReader(fileReader);
				BufferedReader reader = new BufferedReader(fileReader);
				BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in), 1);

				int n = Integer.parseInt(stdin.readLine());
				String line = null;
				//Make a String variable to hold each line as the line is read
				
				if(n < 0)
				{
					String lineRead = "";
					ArrayList<String> mylist = new ArrayList<String>();
          				while((line = reader.readLine())!= null){
                 			mylist.add(line);
						}
						int theSize = mylist.size();
						for(int i = theSize+n; i<theSize; i++)
						{
							System.out.println(mylist.get(i));
						}
				}
	
				if(n==0)
				{
					while((line = reader.readLine()) != null)
					{	
					System.out.println(line);
					}
				}
				
				if(n > 0)
				{
					for(int i = 0; i < n; i++)
					{
						line = reader.readLine();
						System.out.println(line);
					}
				}

				reader.close();
			}
			
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}