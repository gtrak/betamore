// #1. Run this file.
public class Task1{
    public static void main(String[] args){
        System.out.println("HELLO WORLD");
    }
}
 
/*
 Task1 is a class that we wrote.  Classes have 'fields' and
 'methods'.  The class declaration has an access modifier (public,
 private, protected or blank) and a class name.  Everything we write
 today will be 'public' for ease of use.  Notice that some code has
 curly-braces and some has semicolons.  A block with braces does not
 require semicolons.  Everything else does.  Java does not care about
 whitespace.

 'main' is a method or function that we wrote. Java knows to call
 'main' when you run your program, which must be a static method that
 takes an array of String parameters. Every java program's entry point
 is a java class contained within a .java file of the same name.  
 
 every function has an access modifier 'public', optionally a
 'static' modifier to mean that it doesn't need an object instance
 to do its job, a return type ('void' means it doesn't return anything).

 System is a class provided by Java itself.
 'out' is a static field on that class, which is of type PrintStream.
 http://docs.oracle.com/javase/6/docs/api/java/lang/System.html#out

 'println' is a method on the 'out' object, or every PrintStream
 object, that prints the passed in parameter to the standard output 
 stream, your terminal.
 
 "HELLO WORLD" is an object of type String that gets automatically
 created by java and passed in to println.

 2.
 Add a new function called 'print' in the class that takes a parameter
 of type Object, then modify the 'main' to call it and pass in
 hello world.

 3. 
 Modify the 'main' to pass something else into your print
 function, then add some extra words to the end of your command to
 run your program.  You can even run them all at once.

 Here are some ideas:
 print(new java.util.Date());
 print(5+7);
 print("My name is " + "Bill");
 print(1/0);

 What do you get? (hint, the last one is supposed to be bad).

 Congratulations!
 Move on to lesson 2.
*/
