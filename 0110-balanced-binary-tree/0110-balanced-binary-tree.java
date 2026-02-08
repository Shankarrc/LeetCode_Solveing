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
    public int high(TreeNode root){
        if(root==null) return 0;
        int l=high(root.left);
        if(l==-1)return -1;
        int r=high(root.right);
        if(r==-1)return -1;
        if(Math.abs(l-r)>1) return -1;
        return Math.max(l,r)+1;
    }
    public boolean isBalanced(TreeNode root) {
        return high(root) != -1;
    }
}