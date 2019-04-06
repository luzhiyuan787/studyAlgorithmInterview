package chapter4.lesson8;

import java.util.TreeSet;

// 220. Contains Duplicate III
// https://leetcode.com/problems/contains-duplicate-iii/description/
// 时间复杂度: O(nlogk)
// 空间复杂度: O(k)
public class Solution {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

        // 这个问题的测试数据在使用int进行加减运算时会溢出
        // 所以使用long long
        TreeSet<Long> record = new TreeSet<Long>();
        for(int i = 0 ; i < nums.length ; i ++){
            System.out.println("(long)nums[i]  = "+ ((long)nums[i]) );
            System.out.println("(long)nums[i] - (long)t = "+ ((long)nums[i] - (long)t));
            System.out.println("record.ceiling((long)nums[i] - (long)t) = "+ (record.ceiling((long)nums[i] - (long)t)) );
            System.out.println("(long)nums[i] + (long)t = " + ((long)nums[i] + (long)t) );
            System.out.println("record = " + (record.toString()) );
            System.out.println();

            //查看set中是否包含大于(long)nums[i] - (long)t的最小值
            //如果存在该值，则看同(long)nums[i] + (long)t比较是否小于或等于
            //是的话，则返回true
            if(record.ceiling((long)nums[i] - (long)t) != null &&
                    record.ceiling((long)nums[i] - (long)t) <= (long)nums[i] + (long)t)
            return true;

            record.add((long)nums[i]);

            if(record.size() == k + 1)
                record.remove((long)nums[i-k]);

        }

        return false;
    }

    private static void printBool(boolean b){
        System.out.println(b ? "True" : "False");
    }

    public static void main(String[] args) {

//        int[] nums = {-2147483648, -2147483647};
//        int k = 3;
//        int t = 3;

//        int[] nums = {1,5,9,1,5,9};
//        int k = 2;
//        int t = 3;
        int[] nums = {1,0,1,1};
        int k = 1;
        int t = 2;
        printBool((new Solution()).containsNearbyAlmostDuplicate(nums, k, t));
    }
}
