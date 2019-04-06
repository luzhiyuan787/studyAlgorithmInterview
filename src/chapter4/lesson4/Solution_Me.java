package chapter4.lesson4;

import java.util.HashMap;

/**
 * Created by luzhiyuan on 2019/1/5.
 */
public class Solution_Me {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> record = new HashMap<>();
        for (int i = 0;i < nums.length;i ++) {
            if(record.containsKey(target-nums[i])){
                int[] res = {i,record.get(target-nums[i])};
                return res;
            }

            record.put(nums[i],i);

        }
        throw new IllegalStateException("the input has no solution .");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = (new Solution_Me()).twoSum(nums,target);
        for (int num:res) {
            System.out.println(num);
        }
    }
}
