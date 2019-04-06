package chapter5.lesson2;

/**
 * Created by luzhiyuan on 2019/1/6.
 */
public class Solution_Me {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        return pre;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode head2 = (new Solution_Me()).reverseList(head);
        System.out.println(head2);
    }
}
