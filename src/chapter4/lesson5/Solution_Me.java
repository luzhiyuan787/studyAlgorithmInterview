package chapter4.lesson5;

import java.util.HashMap;

/**
 * Created by luzhiyuan on 2019/1/6.
 */
public class Solution_Me {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer,Integer> resAB = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int sum = A[i] + B[j];
                if(resAB.containsKey(sum)){
                    resAB.put(sum,resAB.get(sum) +1);
                }else {
                    resAB.put(sum,1);
                }
            }
        }

        HashMap<Integer,Integer> resCD = new HashMap<>();
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int sum = C[i] + D[j];
                if(resCD.containsKey(sum)){
                    resCD.put(sum,resCD.get(sum) +1);
                }else {
                    resCD.put(sum,1);
                }
            }
        }

        int res = 0;
        for (int sum: resAB.keySet()) {
            if(resCD.containsKey(-sum)){
                res += resAB.get(sum) * resCD.get(-sum);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] A = {1, 2};
        int[] B = {-2,-1};
        int[] C = {-1, 2};
        int[] D = {0, 2};
        System.out.println((new Solution_Me()).fourSumCount(A,B,C,D));
    }
}
