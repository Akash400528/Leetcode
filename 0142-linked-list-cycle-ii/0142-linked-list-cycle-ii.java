/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null)
        return null;
        
        boolean flag = false;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                flag = true;
                break;
            }        
        }
        int i = 0;
         ListNode pos = head;
        if(flag)
        {
        while(pos!=slow)
        {
            i++;
            pos=pos.next;
            slow=slow.next;
        }
        return pos ;
        }
        return null;
    }
}