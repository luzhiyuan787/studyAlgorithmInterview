package chapter6.lesson2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luzhiyuan on 2019/1/7.
 */
public class Solution_Me {
    //二叉树中序遍历
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        inorderTraversal(root, res);
        return res;
    }

    private void inorderTraversal(TreeNode root, ArrayList<Integer> res) {
        if(root != null){
            inorderTraversal(root.left,res);
            res.add(root.val);
            inorderTraversal(root.right,res);
        }
    }

    //二叉树前序遍历
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        preorderTraversal(root, res);
        return res;
    }

    private void preorderTraversal(TreeNode root, ArrayList<Integer> res) {
        if(root != null){
            res.add(root.val);
            preorderTraversal(root.left,res);
            preorderTraversal(root.right,res);
        }
    }


    //二叉树后序遍历
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        postorderTraversal(root, res);
        return res;
    }

    private void postorderTraversal(TreeNode root, ArrayList<Integer> res) {
        if(root != null){
            postorderTraversal(root.left,res);
            postorderTraversal(root.right,res);
            res.add(root.val);
        }
    }

    public static void main(String[] args) {
        String input = "[1,null,2,null,null,3,null]";
        TreeNode root = TreeNode.mkTree(input);
        //二叉树前序遍历
        List<Integer> preorder = (new Solution_Me()).preorderTraversal(root);
        System.out.println(" 二叉树前序遍历 : "+preorder);

        //二叉树中序遍历
        List<Integer> inorder = (new Solution_Me()).inorderTraversal(root);
        System.out.println(" 二叉树中序遍历 : "+inorder);

        //二叉树后序遍历
        List<Integer> postorder = (new Solution_Me()).postorderTraversal(root);
        System.out.println(" 二叉树后序遍历 : "+postorder);
    }

}
