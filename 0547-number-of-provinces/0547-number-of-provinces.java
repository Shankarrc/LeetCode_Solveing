class Solution {

        void dfs (int node, ArrayList<ArrayList<Integer>> adj,int vis[]){

            vis[node]=1;

            for(int n:adj.get(node)){

                if(vis[n]==0){
                    dfs(n,adj,vis);
                }
            }
        }
    public int findCircleNum(int[][] isConnected) {
        

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        int n=isConnected.length;

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }

            }
        }
        int cnt=0;
        int vis[]=new int[n];

        for(int i=0;i<n;i++){

            if(vis[i]!=1){
                cnt++;
                dfs(i,adj,vis);
            }
        }
        return cnt;
    }
}