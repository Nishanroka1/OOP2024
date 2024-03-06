package week1;

public class Test
{
   //----------------------------------------------------
   //  Prints a statement.
   //----------------------------------------------------
   public static void main (String[] args)
   {
      System.out.println ("An Emergency Broadcast");
   }
}
/*
 Introduce the following errors, one at a time. Note any messages that the compiler produces. Fix the previous error each time. If no error messages are produced, be prepared to explain why.

a. Change Test to test.
= Error: The class name must match the filename, so when you change Test to test, you must also rename the file to test.java.
b. Change Emergency to emergency.
= No compilation error. The change is syntactically correct.
c. Remove the first quotation mark in the string.
Error: not a string literal
d. Change main to man.
Error: The main method is the entry point of the Java program. It must be named main.
e. Change println to bogus.
Error: bogus is not a valid method. It should be println.
f. Remove the semicolon at the end of the println statement.
Error: Missing semicolon at the end of the statement.
g. Remove the last brace in the program.
Error: Missing closing brace for the class.
 */
