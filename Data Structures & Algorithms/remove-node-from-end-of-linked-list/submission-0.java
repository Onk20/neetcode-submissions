/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // maintain the the gap of n+1 between slow and fast pointer
        // and when fast pointer reaches the null the slow pointer will 
        // actually be pointing at n+1th positions back from fast
        //i.e we have to remove the node slow.next;

        ListNode fast = head, slow = head;

        for(int i=1; i<=n+1; i++){

            if(fast == null){
                // fast is null in between before n+1 th node then we have 
                // to remove the node which is 1st from the head side
                // i.e head.next
                head = head.next;
                return head;
            }

            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
       // Once fast reaches to null, then slow's next pointer should be removed
       slow.next = slow.next.next;

        return head;
    }
}
