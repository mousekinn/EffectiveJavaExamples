import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FixArray {

    //Primitive Arrays are not immutable!  You can make a Collection immutable, however

    private static final Integer[] PRIVATE_VALUES  = {1, 2, 3, 4, 5};
    public static final List<Integer> VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));

    public static void main(String args[])
    {
        for (int i = 0; i < VALUES.size(); i++)
        {
            VALUES.set(i, VALUES.get(i)*10);
            System.out.println(PRIVATE_VALUES);
        }

    }
}

