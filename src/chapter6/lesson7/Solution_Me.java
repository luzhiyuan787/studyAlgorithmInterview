package chapter6.lesson7;

import javafx.util.Pair;

import java.util.*;

/**
 * Created by luzhiyuan on 2019/1/7.
 */
public class Solution_Me {

    private class PairComparator implements Comparator<Pair<Integer,Integer>> {
        @Override
        public int compare(Pair<Integer, Integer> p1, Pair<Integer, Integer> p2){
            if(p1.getKey() != p2.getKey()){// num ,freq
                return p1.getKey() - p2.getKey();
            }
            return p1.getValue() - p2.getValue();
        }
    }

    public List<Integer> topKFrequent(int[] nums, int k) {
        if(k <= 0)
            throw new IllegalArgumentException("k should be greater than 0");

        HashMap<Integer,Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(freq.containsKey(nums[i])){
                freq.put(nums[i],freq.get(nums[i]) + 1);
            }else {
                freq.put(nums[i],1);
            }
        }

        if(k > freq.size())
            throw new IllegalArgumentException("k should be less than the number of unique numbers in nums");

        // 扫描freq,维护当前出现频率最高的k个元素
        // 在优先队列中,按照频率排序,所以数据对是 (频率,元素) 的形式
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<Pair<Integer, Integer>>(new PairComparator());

        for(Integer num : freq.keySet()){
            int numFreq = freq.get(num);
            if(pq.size() == k){
                if(numFreq > pq.peek().getKey()){
                    pq.poll();
                    pq.add(new Pair<Integer, Integer>(numFreq,num));
                }
            }else {
                pq.add(new Pair<Integer, Integer>(numFreq,num));
            }
        }

        ArrayList<Integer> res = new ArrayList<Integer>();
        while(!pq.isEmpty())
            res.add(pq.poll().getValue());

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(((new Solution_Me()).topKFrequent(nums, k)));
    }
}
