#M7 Programming Assignment

Part 1. Modify the CharStack class from the Module 4 commentary, adding explicit error reporting for stack underflow via a checked exception (i.e., one that must be declared and caught). Provide a main program that tests this new capability.

Part 2. Define a class representing an inflatable balloon. Balloon should have a method inflate( ) (which can be called many times) and a maximum inflation pressure. It should act appropriately if the Balloon is overinflated. Since Balloon is a proper Java class, it shouldn't be possible to change the pressure without calling inflate( )!

Part 3. Write a short program that creates two threads, one of which successively sets a variable to the integers from 1 to 10, and another that reads the values, printing each one as it goes. Use synchronized methods, wait( ) and notify( ). Use a separate condition variable to signify that the integer variable is empty. Since the whole point of the exercise is to make sure that every written value is read, without any values being skipped or overwritten, pay special attention to access control. Look at the sample code in Section 7 of this module's commentary for an idea of how to proceed.


