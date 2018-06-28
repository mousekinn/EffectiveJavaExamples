public class FinalArray {
    public static final int arr[] = {1, 2, 3, 4, 5};
    public static void main(String args[])
    {
         // Note: arr is final
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = arr[i]*10;
            System.out.println(arr[i]);
        }
    }
}
