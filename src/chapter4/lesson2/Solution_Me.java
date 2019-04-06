package chapter4.lesson2;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Created by luzhiyuan on 2019/1/5.
 */
public class Solution_Me {

    public int[] intersect(int[] nums1, int[] nums2) {

        TreeMap<Integer,Integer> record = new TreeMap<>();

        for (int num:nums1) {
            if(record.containsKey(num)){
                record.put(num,record.get(num)+1);
            }else {
                record.put(num,1);
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int num :nums2) {
            if(record.containsKey(num)&&record.get(num)>0){
                res.add(num);
                record.put(num,record.get(num) - 1);
            }
        }

        int[] aa = new int[res.size()];
        int index = 0;
        for (int num: res) {
            aa[index ++] = num;
        }
        return aa;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] res = (new Solution_Me()).intersect(nums1,nums2);
        for (int num:res) {
            System.out.print(num + " ");
        }
    }
}
