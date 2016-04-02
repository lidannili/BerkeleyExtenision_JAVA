#M9 Programming Assignment

Hollywood likes to make remakes of movies. Unfortunately, this means our DVD collection may have duplicate titles of movies that were released in different years. We will use the dvd.xml and dvd.dtd presented in the commentary.

To distinguish these remakes from the original, we will need to add a new field called release_year and modify the dvd.dtd accordingly.

Afterwards, write an XML parser (either in DOM or StAX) that will count the number of movies released by decade.

Add a few more DVD entries to our DVD collection XML file collection to verify your code works.

Print the result with the following example XML format:

<DVD>
 <summary>
   <count decade="1980">2</count>
   <count decade="1990">10</count>
   <count decade="2000">13</count>
 </summary>
</DVD>


Note: Don't worry about writing a DTD for the summary XML file.

