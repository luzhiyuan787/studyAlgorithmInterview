package chapter4.lesson7;

import java.util.HashSet;

/**
 * Created by luzhiyuan on 2019/1/6.
 */
public class Solution_Me {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> record = new HashSet<>();
        for (int i = 0; i < nums.length ; i ++) {
            if (record.contains(nums[i])){
                return true;
            }

            record.add(nums[i]);

            if (record.size() == k + 1){
                record.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        System.out.println( (new Solution_Me()).containsNearbyDuplicate(nums,k));
    }
}
