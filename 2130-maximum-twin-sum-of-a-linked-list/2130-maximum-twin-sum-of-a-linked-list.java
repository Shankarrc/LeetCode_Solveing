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
    public int pairSum(ListNode head) {
        
List<Integer> rev=new ArrayList<>();

ListNode temp=head;
while(temp!=null){

    rev.add(temp.val);
    temp=temp.next;
}

Collections.reverse(rev);
int maxx=Integer.MIN_VALUE;
int n=rev.size();
int sum=0;
for(int i=0;i<n/2;i++){
    sum=0;
    sum+=rev.get(i);
    sum+=head.val;
    maxx=Math.max(sum,maxx);
    head=head.next;
}
return maxx;

    }
}