package chapter3.lesson8;

import java.util.Arrays;

/**
 * Created by luzhiyuan on 2019/1/4.
 */
public class Solution_Me {

    public int lengthOfLongestSubstring(String s) {
        //初始全部字符组成的数组，初始值为-1
        int[] last = new int[256];
        Arrays.fill(last,-1);

        int res = 0;//最长的子字符串长度

        //定义滑动窗口 [l,r]
        int l =0,r=-1;

        while ( r+1 < s.length()){
            r++;
            if(last[s.charAt(r)] != -1){//正在访问的字符以前访问过
                l = Math.max(l,last[s.charAt(r)] + 1);//滑动窗口的左边界更新为上次出现的位置
            }

            res = Math.max(res,r -l + 1);

            last[s.charAt(r)] = r;//字符c这一次出现的位置
        }
        return res;

    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println((new Solution_Me()).lengthOfLongestSubstring(input)+"");
    }
}
