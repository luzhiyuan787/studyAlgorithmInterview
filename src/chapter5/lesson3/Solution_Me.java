package chapter5.lesson3;

/**
 * Created by luzhiyuan on 2019/1/6.
 */
public class Solution_Me {

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);

        dummyHead.next = head;

        ListNode cur = dummyHead;
        while (cur.next != null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }

        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3, 4, 5, 6};
        int val = 6;

        ListNode head = new ListNode(arr);
        System.out.println(head);

        ListNode head2 = (new Solution_Me()).removeElements(head,val);
        System.out.println(head2);
    }
}
