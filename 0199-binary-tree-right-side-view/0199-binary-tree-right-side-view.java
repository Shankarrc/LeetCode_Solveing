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
    public void dfs(TreeNode root,int level,List<Integer>res ){

        if(root ==null) return;
        if(level==res.size()){
        res.add(root.val);

        }
        dfs(root.right,level+1,res);
        dfs(root.left,level+1,res);
    }
    public List<Integer> rightSideView(TreeNode root) {
        // Queue<TreeNode>q=new LinkedList<>();
        // ArrayList<Integer>ans=new ArrayList<>();

        // if(root==null) return ans;

        // q.add(root);

        // while(!q.isEmpty()){

        //     int sz=q.size();

        //     for(int i=0;i<sz;i++){
        //         TreeNode curr=q.poll();

        //         if(i==sz-1)ans.add(curr.val);
                
                
        //         if(curr.left != null){
        //             q.offer(curr.left);
        //         }
        //         if(curr.right !=null){
        //             q.offer(curr.right);
        //         }

        //     }
        // }
        // return ans;

        List<Integer>res=new ArrayList< >();
        dfs(root,0,res);
        return res;
    }
}