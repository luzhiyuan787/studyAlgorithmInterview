package chapter5.lesson4;

/**
 * Created by luzhiyuan on 2019/1/6.
 */
public class Solution_Me {

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode p = dummy;

        while (p.next != null && p.next.next != null){
            ListNode node1 = p.next;
            ListNode node2 = node1.next;
            ListNode next = node2.next;
            node2.next = node1;
            node1.next = next;
            p.next = node2; //???

            p = node1;

        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        ListNode head = new ListNode(arr);
        System.out.println(head);

        head = (new Solution()).swapPairs(head);
        System.out.println(head);
    }
}
