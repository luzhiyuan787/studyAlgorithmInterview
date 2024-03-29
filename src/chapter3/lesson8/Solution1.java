package chapter3.lesson8;

// 3. Longest Substring Without Repeating Characters
// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
//
// 滑动窗口
// 时间复杂度: O(len(s))
// 空间复杂度: O(len(charset))
class Solution1 {
    public int lengthOfLongestSubstring(String s) {

        int[] freq = new int[256];

        int l = 0, r = -1; //滑动窗口为s[l...r]
        int res = 0;

        // 整个循环从 l == 0; r == -1 这个空窗口开始 abcabcbb
        // 到l == s.size(); r == s.size()-1 这个空窗口截止
        // 在每次循环里逐渐改变窗口, 维护freq, 并记录当前窗口中是否找到了一个新的最优值
        while(l < s.length()){

            if(r + 1 < s.length() && freq[s.charAt(r+1)] == 0){
                char aa = s.charAt(++r);
                System.out.println("r   :"+aa);
                freq[aa] ++;
            }
            else {//r已经到头 || freq[s[r+1]] == 1
                char aa =s.charAt(l++);
                System.out.println("l   :"+aa);
                freq[aa] --;
            }

            res = Math.max(res, r-l+1);
            System.out.println("l-   :"+l);
            System.out.println("r-   :"+r);
            System.out.println("length   :"+(r-l+1));
            System.out.println("res   :"+res);
            System.out.println("");
        }

        return res;
    }

    public static void main(String[] args) {

        System.out.println((new Solution1()).lengthOfLongestSubstring( "abcabcbb" ));
//        System.out.println((new Solution1()).lengthOfLongestSubstring( "bbbbb" ));
//        System.out.println((new Solution1()).lengthOfLongestSubstring( "pwwkew" ));
//        System.out.println((new Solution1()).lengthOfLongestSubstring( "" ));
    }
}