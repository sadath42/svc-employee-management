package Basicsq;

public class ArrayUtil {


    public static int reverse(int[] input) {

        //int[] num=new int[]{1,2,4,7} ;

        int temp = 0;
int i;
        for (  i = 0; i <input.length / 2; i++) {
            temp = input[i];
            input[i] = input[input.length - i - 1];
            input[input.length - i - 1] = temp;
        }
        int j;
        for ( j=0; j<input.length-1;j++) {
            System.out.print(input[j] + ",");
        }
        return input[j];


    }

    public static int getHighest(int[] input) {
        //input[]= {1, 2, 3, 4};
        int max = input[0];
        for (int i = 1; i < input.length; i++)
            if (input[i] > max)
                max = input[i];
        return max;
    }
public static int atLeastTwiceLargest(int[] input){


    int max = 0;
        for (int i = 0; i < input.length; ++i)
            if (input[i] > input[max])
    max = i;


        for (int i = 0; i < input.length; ++i)
            if (max != i && input[max] < 2 * input[i])
            return -1;

        return max;
}


    }




















