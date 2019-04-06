package chapter6.lesson4;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by luzhiyuan on 2019/1/7.
 */
public class Solution_Me {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if(root == null){
            return res;
        }
        //Pair<TreeNode,Integer> 节点，层级
        //queue 先进先出
        LinkedList<Pair<TreeNode,Integer>> queue = new LinkedList<Pair<TreeNode,Integer>>();
        queue.add(new Pair<TreeNode,Integer>(root,0));

        while (!queue.isEmpty()){
            Pair<TreeNode,Integer> front = queue.removeFirst();
            TreeNode node = front.getKey();
            int level = front.getValue();

            if(level == res.size()){
                res.add(new ArrayList<Integer>());
            }

            res.get(level).add(node.val);

            if(node.left != null){
                queue.add(new Pair<TreeNode,Integer>(node.left,level + 1));
            }
            if(node.right != null){
                queue.add(new Pair<TreeNode,Integer>(node.right,level + 1));
            }
        }
        return res;
    }
}
