package chapter6.lesson5;

import javafx.util.Pair;

import java.util.LinkedList;

/**
 * Created by luzhiyuan on 2019/1/7.
 */
public class Solution_Me {

    public int numSquares(int n) {
        LinkedList<Pair<Integer,Integer>> queue = new LinkedList<>();
        queue.push(new Pair<Integer,Integer>(n,0));

        boolean[] visited = new boolean[n+1];
        visited[n] = true;

        while (!queue.isEmpty()){
            Pair<Integer,Integer> front = queue.removeFirst();
            int sum = front.getKey();
            int step = front.getValue();

            if(sum == 0){
                return step;
            }

            for (int i = 1;  sum - i * i >= 0 ; i++) {
                if(!visited[sum - i * i]){
                    queue.addLast(new Pair<Integer,Integer>(sum - i * i,step + 1));
                    visited[sum - i * i] = true;
                }

            }
        }
        throw new IllegalStateException("No Solution.");
    }



    public static void main(String[] args) {

        System.out.println((new Solution_Me()).numSquares(12));
        System.out.println((new Solution_Me()).numSquares(13));
    }
}
