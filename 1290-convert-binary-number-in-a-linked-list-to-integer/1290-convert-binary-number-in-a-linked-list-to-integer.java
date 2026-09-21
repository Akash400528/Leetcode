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
    public int getDecimalValue(ListNode head) {
 
   String a="";
   ListNode temp=head;
   while(temp!=null)
   {
   
    a+=temp.val;
    temp=temp.next;
   }
   int n=0;
   int j=0;
   for(int i=a.length()-1;i>=0;i--)
   {

    int m=Integer.parseInt(String.valueOf(a.charAt(i)));
      n+=m*Math.pow(2,j);
      j++;
   }
   return n;
     
    }
}