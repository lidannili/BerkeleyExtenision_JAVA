#M3 Programming Assignment

Write a recursive function that reverses a String. A recursive function (as defined in the commentary) is a function that calls itself. The function should return a String and take only one argument, also a String. It should look like this:

	static String reverse(String s) { ... }


(The keyword static simply makes the function easy to call from a main( ) routine in the same class; we learn what it means in the next module.) This function reverse( ) should return the reversed String to the caller, not print the reversed String itself. reverse( ) should follow the rules for well-behaved recursive functions as described in the commentary: in particular, it should use only local variables.

The **java.lang.String** member functions **charAt( )** and **substring( )** may be useful.