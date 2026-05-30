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
    class Pair{
        int row;
        int col;
        TreeNode root;
        Pair(TreeNode root,int row,int col){
            this.root=root;
            this.row=row;
            this.col=col;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> res=new TreeMap<>();


            List<List<Integer>> ans=new ArrayList<>();



            Queue<Pair>q=new LinkedList<>();


                q.add(new Pair(root,0,0));

                while(!q.isEmpty()){

                    
                    Pair val=q.poll();
                    TreeNode node  =val.root;
                    int  row=val.row;
                    int col=val.col;

                    res.putIfAbsent(col,new TreeMap<>());
                    res.get(col).putIfAbsent(row,new PriorityQueue<>());

                    res.get(col).get(row).add(node.val);

                    if(node.left!= null){
                        q.add(new Pair(node.left,row+1,col-1));

                    }
                    if(node.right != null){
                        q.add(new Pair(node.right,row+1,col+1));
                    }

                }


                for(TreeMap<Integer,PriorityQueue<Integer>>rows:res.values()){

                    List<Integer>result=new ArrayList<>();

                    for(PriorityQueue<Integer> pq:rows.values()){
                        
                        while(!pq.isEmpty()){

                            result.add(pq.poll());
                        }
                    }
                    ans.add(result);
                }

        return ans;
    }
}