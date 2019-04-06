package chapter4.lesson1;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by luzhiyuan on 2019/1/5.
 */
public class Solution_Me {

    public int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> nums1Tree = new TreeSet<>();

        for (int num:nums1) {
            nums1Tree.add(num);
        }

        TreeSet<Integer> resSet = new TreeSet<>();
        for (int num:nums2) {
            if(nums1Tree.contains(num)){
                resSet.add(num);
            }
        }

        int[] res = new int[resSet.size()];
        int index = 0;
        for (int num:resSet) {
            res[index ++] = num;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] res = (new Solution_Me()).intersection(nums1,nums2);

        for (int num :res) {
            System.out.println(num);
        }

    }
}
