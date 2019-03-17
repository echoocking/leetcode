import java.util.HashMap;
import java.util.HashSet;


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


    // 滑动窗口法。
    public static int sliding(String s) {
        HashSet set = new HashSet();
        int i=0, j=0, ans=0;
        int l = s.length();
        while (i<l && j<l) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));  // j++ 后计算ans。使用两个下标相减，计算长度需要加一。
                ans = Math.max(j-i, ans);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    /*
     * 主要思路：
     *      用窗口移动确定无重复子串的位置。用hash set进行下一字符的重复判断。
     *
     * hash：任意相同的obj，算法给出的结果都是相同的。以下简称H.A
     *
     *
     * hash set：
     *      hash算法计算出obj的索引值，根据索引值可以进行obj的寻址，如果该地址非空，说明该数据已经存在了
     *
     *      有如下 'asd', 'zxc', 'qwe', 'asd'字符串。
     *      有Array a1【, , , , , ...】
     *      假设通过H.A计算后，地址为 2，4，5，2
     *      那么hash set的存储为 【, , 'asd', , 'zxc', 'qwe'】
     *      下次来相同的值，也可通过H.A判断是否已经在a1中存在了。
     *
     *
     * hash map：<k, v> （以java中hash map的实现为例）
     *      hash算法计算出k的hash值。索引 = hash值%size，如果位置为None，直接在索引标示的位置中将 Node<k, v> (int hash, k, v, Node next) 存入对应的位置。
     *      非空需要比对k，hash值。不同就用把数据挂到 next 的Node上。
     *      新版java使用二叉树替换了link list。查询效率会更高一点。
     *
     */
}

