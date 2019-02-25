public class LongestSubString {
    protected int getLength() {
        return 0;
    }

    public static int lengthOfLongestSubstring(String s) {


        int currentMaxLen = 1;
        int sLen = s.length();

        if (sLen == 0) {
            return 0;
        }

        for (int i=0; sLen - i > currentMaxLen; i++) {
            String subStr = s.substring(i, sLen);
            int subStrLen = subStr.length();
            int T = 1;
            for (int j=0; j < subStrLen; j++) {
                // 加到与子串长度相等，截取字串就会超出范围，所以这里直接赋值，返回
                if (T == subStrLen) {
                    currentMaxLen = T;
                    break;
                }
                String innerStr = subStr.substring(0, T+1);
                String tailS = String.valueOf(subStr.charAt(T));
                if (innerStr.indexOf(tailS) != T) {
                    if (T > currentMaxLen) {
                        currentMaxLen = T;
                    }
                    break;

                } else T ++;


            }
        }

        return currentMaxLen;

    }

    public static void main(String[] args) {
//        String a = "123".substring(0,3);
       int l = lengthOfLongestSubstring("");
       System.out.print(l);
    }

}
