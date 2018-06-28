package p2;
import p1.*;


// Trying to access the default class in p1 should result in a compile time error
// Trying to access the private class in p1 should result in an error
// Trying to access the public class in p1 should compile correctly.

public class Test2 {

    public static void main (String args[])
    {
        //attempt to access p1
        Test1 testMe = new Test1();

        //testMe.display();
    }

}
