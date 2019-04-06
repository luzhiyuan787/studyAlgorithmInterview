package chapter5.lesson5;

/**
 * Created by luzhiyuan on 2019/1/6.
 */
public class Solution_Me {

    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;

    }

    public static void main(String[] args) {
        int[] headList = {4,5,1,9};
        int num = 5;

        ListNode head = new ListNode(headList);
        System.out.println(head);

        ListNode node =  head.findNode(num);

        (new Solution_Me()).deleteNode(node);
        System.out.println(head);
    }
}
