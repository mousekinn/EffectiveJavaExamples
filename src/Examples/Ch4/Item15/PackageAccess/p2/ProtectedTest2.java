package p2;

import p1.*;

public class ProtectedTest2 extends ClassProtected {

    public static void main (String args[])
    {
        // Notice we are creating an object of this class, not of ClassProtected.
        // This is due to inheritance of the display method.

        ProtectedTest2 testMe = new ProtectedTest2();
        testMe.display();

        // We cannot access the display method by creating an instance of the parent Object
        ClassProtected cannotDisplay = new ClassProtected();
        //cannotDisplay.display(); //Error due to protected

    }


}
