package chapter5.lesson6;

/**
 * Created by luzhiyuan on 2019/1/6.
 */
public class Solution_Me {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int length = 0;
        for(ListNode cur = dummy.next;cur != null; cur= cur.next){
            length ++;
        }

        int k = length - n ;
        ListNode cur = dummy;
        for (int i = 0; i < k; i++) {
            cur = cur.next;
        }

        cur.next = cur.next.next;

        return  dummy.next;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        ListNode head = new ListNode(arr);
        System.out.println(head);

        head = (new Solution_Me()).removeNthFromEnd(head, 2);
        System.out.println(head);
    }
}
