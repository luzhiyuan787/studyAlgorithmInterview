package chapter4.lesson8;

import java.util.TreeSet;

/**
 * Created by luzhiyuan on 2019/1/6.
 */
public class Solution_Me {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> record = new TreeSet<Long>();

        for (int i = 0; i < nums.length; i++) {
            if(record.ceiling((long)nums[i] - (long)t) != null &&
                    record.ceiling((long)nums[i] - (long)t) <= ((long)nums[i] + (long)t)  ){
                return true;
            }

            record.add((long)nums[i]);

            if(record.size() == k + 1){
                record.remove((long)nums[i - k]);
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        int t = 0;

        System.out.println((new Solution_Me()).containsNearbyAlmostDuplicate(nums,k,t));
    }
}
