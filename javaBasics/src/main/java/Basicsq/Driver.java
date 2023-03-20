package Basicsq;

public class Driver {

    public static void main(String[] args) {


        ArrayUtil arrayUtil=new ArrayUtil();
        StringUtil stringUtil=new StringUtil();
        int[] input=new int[]{4,5,6,7,8};


        System.out.println(arrayUtil.reverse(input));

        System.out.println(arrayUtil.getHighest(input));

        System.out.println(arrayUtil.atLeastTwiceLargest(input));

        System.out.println(stringUtil.addBinary("1","11"));

        System.out.println(stringUtil.strStr("northamerica","america"));
    }
}
