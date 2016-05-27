//Write a short program that creates two threads, 
//one of which successively sets a variable to the integers from 1 to 10, 
//and another that reads the values, printing each one as it goes. 
//Use synchronized methods, wait( ) and notify( ). 
//Use a separate condition variable to signify that the integer variable is empty. 
//Since the whole point of the exercise is to make sure that every written value is read, 
//without any values being skipped or overwritten, pay special attention to access control. 
//Look at the sample code in Section 7 of this module's commentary for an idea of how to proceed.

class TwoThreads implements Runnable
{

	public static void main(String[] args)
	{
		TwoThreads twoThreads = new TwoThreads();
		Thread one = new Thread(twoThreads);
		Thread two = new Thread(twoThreads);
		one.setName("Enter");
		two.setName("Print");
		one.start();
		two.start();
	}

	public void run()
	{
		for(int x = 1; x<=10; x++)
			{
				insert(x);
				extract();
			}
	}


    Integer data = null;
    //sets a variable to the integers from 1 to 10
    synchronized void insert(Integer i) 
    {
      try {
       while (data != null)
       {
          // data already holds a string
          // wait for some other Thread 
          //to remove it!
          // awaken one other waiting Thread
          notify();      
          // release the monitor
          wait();             
       }
      } catch (InterruptedException e) {}
      // data is now null
      data = i;
      notify();
   }
   
  synchronized Integer extract()
  {
    try 
    {
     while (data == null)
     {
       // no data to extract
       // wait for some to arrive
       // awaken one other waiting Thread
       notify();      
       // release the monitor and go to sleep
       wait();        
     }
    } 
	catch (InterruptedException e) {}

     // data is now not full
    Integer temp = data;
    
    data = null;
    notify();
    System.out.println(Thread.currentThread().getName());
    System.out.println(temp);
    return temp;

   }

     // more methods
 }
