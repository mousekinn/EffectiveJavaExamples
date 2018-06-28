package p1;

//Default, AKA Protected Private, are only accessible within the same package.
// Here we've defined a simple "Hello World"

public class Test1 {

    // Trying to access the default class in p1 should result in a compile time error
//  void display()
//    {
//       System.out.println("Hello World!");
//    }


    // Trying to access the private class in p1 should result in an error
   private void display()
 {

       System.out.println("Hello World!");

   }

    // Trying to access the public class in p1 should compile correctly.
   // public void display()
   // {
   //  System.out.println("Hello World");
   // }

}
