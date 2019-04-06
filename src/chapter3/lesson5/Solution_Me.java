package chapter3.lesson5;

/**
 * Created by luzhiyuan on 2019/1/4.
 */
public class Solution_Me {

    public void sortColors(int[] nums) {

        int zero = -1;// [0,zero] =0
        int two = nums.length;//[two,n-1] =2

        for (int i = 0; i <two ; ) {
            if(nums[i] == 1){
                i ++;
            }else if(nums[i] == 2){
                swap(nums,i,--two);
            }else {
                assert nums[i] == 0;
                swap(nums,++zero,i++);
            }
        }


        /*//计数器，记录0、1、2在数组中出现的频次
        int[] count = {0,0,0};
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]] ++;
        }

        //数组的索引
        int index = 0;

        //通过计数器中的频次，在数组中重新赋值
        // 0
        for (int i = 0; i < count[0]; i++) {
            nums[index ++] = 0;
        }

        // 1
        for (int i = 0; i < count[1]; i++) {
            nums[index ++] = 1;
        }

        // 2
        for (int i = 0; i < count[2]; i++) {
            nums[index ++] = 2;
        }*/

    }

    private void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        (new Solution_Me()).sortColors(nums);
        for (int num:nums) {
            System.out.println(num);
        }
        System.out.println();

    }
}
