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
    public void dfs(TreeNode root,int level,List<Integer> res){

        if(root ==null) return ;

        if(res.size()==level) res.add(root.val);

        dfs(root.left,level+1,res);
        dfs(root.right,level+1,res);
    }
    public int findBottomLeftValue(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        dfs(root,0,ans);
        return ans.get(ans.size()-1);
    }
}