package chapter3.lesson6;

/**
 * Created by luzhiyuan on 2019/1/4.
 */
public class Solution_Me {

    public int[] twoSum(int[] numbers, int target) {

        int l = 0;
        int r = numbers.length -1;

        while (l < r){
            if(numbers[l] + numbers[r] == target){
                int[] sumIndex = {l+1,r+1};
                return  sumIndex ;
            }else if (numbers[l] + numbers[r] > target){
                r--;
            }else {
                l ++;
            }
        }
        throw new IllegalStateException("The input has no solution .");





        /*//遍历数组numbers
        for (int i = 0; i <numbers.length ; i++) {

            //当前数字
            int current = numbers[i];

            //目标数字
            int tar = target - current;

            //在数组中通过二分查找法查找目标数字
            int res = binarySearch(numbers,i+1,numbers.length-1,tar);

            if(res != -1){
                int[] sumIndex = {i+1,res+1};
                return  sumIndex ;
            }
        }
        throw new IllegalStateException("The input has no solution .");*/
    }

    private int binarySearch(int[] numbers,int l, int r, int target){

        //判断不越界

        while (l <= r){

            int mid = l + (r-l)/2;

            if(numbers[mid] == target){
                return mid;
            }else if(numbers[mid] > target){
                r = mid -1;
            }else {
                l = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = (new Solution_Me()).twoSum(nums,target);
        for (int num:res) {
            System.out.printf(num + " " );
        }
    }
}
