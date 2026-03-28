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
    public ListNode kthNode(ListNode temp,int k){

        ListNode curr=temp;
        for(int i=1;i<k;i++){

            if(curr.next ==null) return null;
            curr=curr.next;

        }
        return curr;
    }
    public ListNode  rev(ListNode head){
        ListNode curr=head;
        ListNode temp=null;
        ListNode prev=null;

        while(curr != null){

            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev=null;
        ListNode temp=head;

        while(temp!=null){

        ListNode kNode=kthNode(temp,k);
        if(kNode == null){
            if(prev!= null)
            {prev.next=temp;
            }
            break;
        }

        ListNode nextnode=kNode.next;
        kNode.next=null;
         ListNode newnode=rev(temp);
        if(temp==head){
            head=newnode;
        }
        else{
            prev.next=newnode;
        }
        
        prev=temp;
        temp=nextnode;
        
        }
    return head;
    }
}