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
    public ListNode reverse(ListNode l1){

         ListNode curr=l1;
        ListNode prev=null;
        while(curr!=null){
           
            ListNode temp=curr.next;
             curr.next=prev;
             prev=curr;
             curr=temp;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=reverse(l1);
        ListNode l4=reverse(l2);
        ListNode head=new ListNode(0);
        ListNode curr=head;
        int carry=0;
        while(l3 !=null || l4 != null || carry !=0){
            int x,y;

            if(l3 != null){
                x=l3.val;
            }
            else{
                x=0;
            }
            if(l4 != null){
                y=l4.val;
            }
            else{
                y=0;

            }
             int sum=x+y+carry;
             carry=sum/10;
             curr.next=new ListNode(sum%10);
             curr=curr.next;

             if(l3 != null)l3=l3.next;
             if(l4 != null)l4=l4.next;
        }
        ListNode ans=reverse(head.next);
         return ans;
    }
}