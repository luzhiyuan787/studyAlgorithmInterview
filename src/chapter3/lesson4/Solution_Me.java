package chapter3.lesson4;

import java.util.ArrayList;

/**
 * Created by luzhiyuan on 2019/1/3.
 */
public class Solution_Me {

    public void moveZeroes(int[] nums) {

        /*//将数组中不为0的元素放到nonZerosList中
        ArrayList<Integer> nonZerosList = new ArrayList();
        for (int num:nums) {
            if(num != 0){
                nonZerosList.add(num);
            }
        }

        //将nonZerosList中元素依次放回nums数组中
        for(int i=0; i< nonZerosList.size(); i++){
            nums[i] = nonZerosList.get(i);
        }

        //nums数组中其余数据全部置为0
        for(int i =nonZerosList.size(); i< nums.length ; i++){
            nums[i] = 0;
        }*/

        int k = 0; //[0,k] 依次是 nums 中的非0整数
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] !=0){
                if(k != i){
                   swap(nums,i,k++);
                }else {
                    k ++;
                }
            }
        }

    }

    private void swap(int[] nums,int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        (new Solution_Me()).moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
