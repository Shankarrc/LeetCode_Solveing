/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
           int ans=0;
        int level=0;
        int maxx=Integer.MIN_VALUE;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            level++;
            int s=q.size();
            int currsum=0;
            for(int i=s;i>0;i--){
                TreeNode tn=q.poll();
                currsum+=tn.val;
                if(tn.left !=null){
                  q.add(tn.left);
                  }
                if(tn.right !=null){
                   q.add(tn.right);
                 }
            }
            if(currsum>maxx){
                maxx=currsum;
                ans=level;
            }
        }
        return ans;
    }
}