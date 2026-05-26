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

    public int rec(TreeNode root,int a[]){

    if(root==null) return 0 ;

    int lf=Math.max(0,rec(root.left,a));
    int rg=Math.max(0,rec(root.right,a));
    a[0]=Math.max(a[0],lf+rg+root.val);

    return Math.max(lf,rg)+root.val;

    
    }

     


    public int maxPathSum(TreeNode root) {
        
        int dia[]=new int[1];
        dia[0]=Integer.MIN_VALUE;
        rec(root,dia);
        return dia[0];
    }
}