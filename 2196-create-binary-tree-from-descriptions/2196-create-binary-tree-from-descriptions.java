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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode> shan=new HashMap<>();

        HashSet<Integer>st=new HashSet<>();
        for(int dis[]:descriptions){

            int parent=dis[0];
            int child=dis[1];
            boolean isleft=(1==dis[2]);

            shan.putIfAbsent(parent,new TreeNode(parent));
            shan.putIfAbsent(child,new TreeNode(child));

            if(isleft){
                shan.get(parent).left=shan.get(child);
            }
            else{
                shan.get(parent).right=shan.get(child);
            }
            st.add(child);
        }
        for(TreeNode node:shan.values()){
            if(!st.contains(node.val)) return node;
        }
            return null ;

    }
}