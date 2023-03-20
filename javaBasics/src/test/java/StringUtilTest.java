import Basicsq.StringUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    @Test
     void addBinaryTestPositive(){
        //String a="101";
        //String b="11";
        String exceptedResult="1000";
        String actualResult=StringUtil.addBinary("101","11");
        Assertions.assertEquals(exceptedResult,actualResult);
    }

    @Test
    void addBinaryTestNegative(){

        String exceptedResult=null;
        String actualResult=StringUtil.addBinary(null,null);
        Assertions.assertEquals(exceptedResult,actualResult);
    }

    @Test
    void addBinaryTestEmpty(){

        String exceptedResult="";
        String actualResult=StringUtil.addBinary("","");
        Assertions.assertEquals(exceptedResult,actualResult);
    }
    @Test
    void strStrTestPositive(){
        //String a="101";
        //String b="11";
        int exceptedResult=3;
        int actualResult= StringUtil.strStr("newyork","york");
        Assertions.assertEquals(exceptedResult,actualResult);
    }

    @Test
    void strStrTestNegative(){
        //String a="101";
        //String b="11";
        int exceptedResult= -1;
        int actualResult= StringUtil.strStr(null,null);
        Assertions.assertEquals(exceptedResult,actualResult);
    }

    @Test
    void strStrTestEmpty(){
        //String a="101";
        //String b="11";
        int exceptedResult= -1;
        int actualResult= StringUtil.strStr("","");
        Assertions.assertEquals(exceptedResult,actualResult);
    }



}
