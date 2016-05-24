//parse an XML document with StAX
import javax.xml.stream.*; 
import javax.xml.stream.events.*;
import java.io.*;
import java.util.*; 

public class StaxRW
{
      public static  int count1 = 0;
      public static  int count2 = 0;
      public static  int count3 = 0;
      public static int count4 = 0;
      public void read(String  filepath) 
      {
         try 
         {
              FileInputStream fileInputStream = new  FileInputStream(filepath);
              XMLInputFactory factory = XMLInputFactory.newInstance(); //Create an XMLInputFactory
              XMLStreamReader xmlStreamReader = factory.createXMLStreamReader(fileInputStream);
              //Create an XMLStreamReader and pass a Reader to it such as a FileReader. The XML file is passed as a parameter to FileReader.
              while (xmlStreamReader.hasNext()) 
              {
                  readDVDList(xmlStreamReader);
              }
              xmlStreamReader.close();
          } 
          catch  (XMLStreamException e) 
          {
              e.printStackTrace(); 
          } 
          catch  (FileNotFoundException e) 
          {
              e.printStackTrace(); 
          }
       }
 
       public void  readDVDList(XMLStreamReader reader) throws XMLStreamException 
       {
            int eventCode =  reader.next(); 
            //iterate through the contents of our XML file using the streamreader's next( ) method.
            switch (eventCode) 
            {
              case XMLStreamReader.START_ELEMENT:
              String key = reader.getLocalName();
              if (key.equals("DVD")) 
              {
                  readDVD(reader);
              }
               break;
            }
            //next( ) returns an event code that indicates which part of the document has been read 
            //such as: DTD, START_ELEMENT, CHARACTERS and END_ELEMENT.
       }

        
        private void  readDVD(XMLStreamReader reader) throws XMLStreamException 
        {
             String name = "";
             String value = "";
             
             while (reader.hasNext()) 
             {      
                    int eventCode = reader.next();
                    switch (eventCode) 
                    {
                          case XMLStreamReader.START_ELEMENT:
                          name =  reader.getLocalName();
                          break;
                          case XMLStreamReader.END_ELEMENT:
                          name =  reader.getLocalName();
                          if (name.equals("DVD"))  return;  
                          break;
                          case XMLStreamReader.CHARACTERS:
                          value =  reader.getText();

                          if (name.equals("release_year"))
                                { 
                                  boolean b1 = value.startsWith("198");
                                  boolean b2 = value.startsWith("199");
                                  boolean b3 = value.startsWith("200");
                                  boolean b4 = value.startsWith("201");
                                  if(b1) 
                                  {
                                    count1++;
                                  }
                                  if(b2) 
                                  {
                                    count2++;
                        
                                  }
                                  if(b3) 
                                  {
                                    count3++;
                                    
                                  }
                                  if(b4)
                                  {
                                    count4++;
                                  }


                                } 
                          //System.out.println("Element  name= " + name + " value=" + value);
                          break;
                    }
              }return;       
        }

      public void write(String fn){
          XMLStreamWriter xw =  null; 
          XMLOutputFactory xof = XMLOutputFactory.newInstance(); 
          try 
          {
              xw =  xof.createXMLStreamWriter(new FileWriter(fn));
              xw.writeStartElement("DVD");     
              xw.writeStartElement("summary");
              xw.writeStartElement("count");
              xw.writeAttribute("decade",  "1980");
              xw.writeCharacters(Integer.toString(count1)); //count1
              xw.writeEndElement();
              xw.writeStartElement("count");
              xw.writeAttribute("decade",  "1990");
              xw.writeCharacters(Integer.toString(count2));//count2
              xw.writeEndElement();
              xw.writeStartElement("count");
              xw.writeAttribute("decade",  "2000");
              xw.writeCharacters(Integer.toString(count3));//count3
               xw.writeStartElement("count");
              xw.writeAttribute("decade",  "2010");
              xw.writeCharacters(Integer.toString(count4));//count3
              xw.writeEndElement();
              xw.writeEndElement();
              xw.writeEndElement();
              xw.writeEndDocument();
              xw.flush();
              xw.close();         
          } 
          catch  (XMLStreamException e) {
              e.printStackTrace();
          } 
          catch (IOException e)  {
              e.printStackTrace();
          }
    }

 
      public static void  main(String[] args) 
      {
           StaxRW dvdRW =  new StaxRW();
           dvdRW.read("dvd.xml");
           dvdRW.write("dvd1.xml");
      }
}