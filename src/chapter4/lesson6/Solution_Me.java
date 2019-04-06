package chapter4.lesson6;

import java.util.HashMap;

/**
 * Created by luzhiyuan on 2019/1/6.
 */
public class Solution_Me {

    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        for (int i = 0; i < points.length; i++) {

            int[] point = points[i];

            HashMap<Integer,Integer> record = new HashMap<>();
            // record 记录从 point点 到 其他点的距离
            for(int j = 0; j < points.length; j++){
                if(j != i){
                    int dis = distance(point,points[j]);
                    if(record.containsKey(dis)){
                        record.put(dis,record.get(dis) + 1);
                    }else {
                        record.put(dis,1);
                    }
                }
            }

            for (int dis:record.keySet()) {
                res += record.get(dis) * (record.get(dis) -1 );
            }
        }
        return res;
    }

    private int distance(int[] pointA,int[] pointB){
        return (pointA[0]-pointB[0]) * (pointA[0]-pointB[0]) +
                (pointA[1]-pointB[1]) * (pointA[1]-pointB[1]);
    }

    public static void main(String[] args) {
        int[][] input = {{0,0},{1,0},{2,0}};
        System.out.println((new Solution_Me()).numberOfBoomerangs(input));
    }
}
