package Basicsq;

public class StringUtil {

     public static int strStr(String haystack, String needle) {
        int m = needle.length();
        int n = haystack.length();

        for (int windowStart = 0; windowStart <= n - m; windowStart++) {
            for (int i = 0; i < m; i++) {
                if (needle.charAt(i) != haystack.charAt(windowStart + i)) {
                    break;
                }
                if (i == m - 1) {
                    return windowStart;
                }
            }
        }

        return -1;
    }
    public static String addBinary(String a,String b) {

            int i = a.length()-1;

            int j = b.length()-1;

            int carry = 0;

            int sum = 0;
            StringBuilder result =  new StringBuilder();
            while(i>=0 || j>=0 || carry == 1){
                sum = carry;
                if(i>=0) sum = sum+a.charAt(i)-'0';
                if(j>=0) sum = sum+b.charAt(j)-'0';
                result.append((char)(sum%2+'0'));
                carry = sum/2;
                i--;
                j--;
            }
            return result.reverse().toString();
        }


}


