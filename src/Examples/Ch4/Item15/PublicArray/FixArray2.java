import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FixArray2 {

    //Primitive Arrays are not immutable!  You can make a Collection immutable, however

    private static final Integer[] PRIVATE_VALUES  = {1, 2, 3,  4, 5};

    public static void main(String args[]) {
        Integer[] gimmieArray = values();
        System.out.println(Arrays.toString(gimmieArray));

   }
    public static final Integer[] values()
    {
        return PRIVATE_VALUES.clone();
    }
}
