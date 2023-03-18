import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayUtilTest {

    @Test
    void testReverse(){
        int input[] = {8,7,6,5};
        int expectedResult[]={5,6,7,8};
        int actualResult[] = ArrayUtil.reverse(input);
        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    void testReverseNegative(){
        int input[] = null;
        int expectedResult[]=null;
        int actualResult[] = ArrayUtil.reverse(input);
        Assertions.assertArrayEquals(expectedResult,actualResult);

         input = new int[0];
         expectedResult =new int[0];
        int actualResult[] = ArrayUtil.reverse(input);
        Assertions.assertArrayEquals(expectedResult,actualResult);
    }


    @Test
    void testHighest(){
        int input[] = {3,6,1,0,8,5,8,9,80,80};
        int expectedResult=80;
        int actualResult = ArrayUtil.getHighest(input);
        Assertions.assertEquals(expectedResult,actualResult);
    }


    @Test
    void testHighestNegative(){
        int input[] = null;
        int expectedResult=-1;
        int actualResult = ArrayUtil.getHighest(input);
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    void testHighestNegativeEmpty(){


        int[] input = new int[0];
        int expectedResult = -1;
        int actualResult = ArrayUtil.getHighest(input);
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    void testTwiceLargest(){
        int input[] = {1,2,2,3,6,1,0};
        int expectedResult=4;
        int actualResult = ArrayUtil.atLeastTwiceLargest(input);
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    void testTwiceLargestNegative(){
        int input[] = null;
        int expectedResult=-1;
        int actualResult = ArrayUtil.atLeastTwiceLargest(input);
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    void testTwiceLargestEmpty(){


        int[] input = new int[0];
        int expectedResult = -1;
        int actualResult = ArrayUtil.atLeastTwiceLargest(input);
        Assertions.assertEquals(expectedResult,actualResult);
    }

}
