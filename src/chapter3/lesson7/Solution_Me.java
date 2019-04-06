package chapter3.lesson7;

/**
 * Created by luzhiyuan on 2019/1/4.
 */
public class Solution_Me {

    public int minSubArrayLen(int s, int[] nums) {

        //sum[i]表示nums[0,i-1]的和
        int[] sums = new int[nums.length+1];
        sums[0] = 0;
        for (int i = 1; i < nums.length+1 ; i ++) {
            //sums[i] = sums[i-1] +nums[i-1];
            sums[i] = sums[i-1] + nums[i-1];
        }

        int res = nums.length +1;
        for (int l = 0; l < nums.length -1; l ++) {
            //lowerBound
            int r = lowerBound(sums,sums[l]+s);
            if(r != sums.length){
                res = Math.min(res,r - l);
            }
        }

        if(res == nums.length+1){
            return 0;
        }

        return res;

    }

    // 在有序数组nums中寻找大于等于target的最小值
    // 如果没有（nums数组中所有值都小于target），则返回nums.length
    private int lowerBound(int[] nums, int target){

        if(nums == null /*|| !isSorted(nums)*/)
            throw new IllegalArgumentException("Illegal argument nums in lowerBound.");

        int l = 0, r = nums.length; // 在nums[l...r)的范围里寻找解
        while(l != r){
            int mid = l + (r - l) / 2;
            if(nums[mid] >= target)
                r = mid;
            else
                l = mid + 1;
        }

        return l;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int s = 7;
        System.out.println((new Solution_Me()).minSubArrayLen(s,nums));
    }
}
