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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        
        ListNode fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode pre=null;
        ListNode cur=slow;
     while(cur!=null)
     {
        ListNode nn=cur.next;
        cur.next=pre;
        pre=cur;
        cur=nn;
     }
     ListNode fir=head;
    ListNode sec=pre;
     while(sec!=null)
     {
        if(fir.val!=sec.val)
        {
           return false;
        }
        fir=fir.next;
        sec=sec.next;
     }
     return true;
        
    }
}