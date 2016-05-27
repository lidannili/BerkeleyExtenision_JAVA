//Part 1. Modify the CharStack class from the Module 4 commentary, adding explicit error reporting for stack underflow via a checked exception 
//(i.e., one that must be declared and caught). Provide a main program that tests this new capability.
import java.io.*;


public class CharStack
{
  private char[] m_data;        // declare an array of characters, name it m_data
  
  private int m_ptr;  // declare a integer variable, name it m_ptr
  
  public CharStack(int size)
  {
      m_ptr = 0;                   // 
      m_data = new char[(size > 1 ? size : 10)]; // if size > 1, m_data = size; else, if size < 1, m_data = 10;
  }

  public void push(char c)
  {
      if (m_ptr >= m_data.length) //
      {
         // Grow the array automatically
         char[] tmp = new char[m_data.length * 2]; //create a new array of characters with a new length and store the value in a new character array called tmp
      
         System.arraycopy(m_data, 0, tmp, 0, m_data.length);
         m_data = tmp;
      }
      m_data[m_ptr++] = c;
  }

  public class StackUnderflowException extends Exception{}
      
  public char pop()          
  {
      try
      {
        if(m_ptr > 0);   
      }

      catch (Exception  ex)
      {
        System.out.println("No char to pop!");
      }
      return m_data[--m_ptr];     
  }


  public boolean hasMoreElements()
  {
      return (m_ptr != 0);
  }  
  
  public static void main(String[] argv) throws IOException
  {
      CharStack s = new CharStack(10);
      int i;
      while ( (i = System.in.read()) != -1 )
      {
         s.push((char) i);
      }
      while (s.hasMoreElements())
      {
         System.out.write(s.pop());
      }
      System.out.println();
  }


}