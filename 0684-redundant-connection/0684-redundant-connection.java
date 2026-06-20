class Solution {
    int [] parent,rank;

    int find(int x){

        if(parent[x]!=x){
            parent[x]=find(parent[x]);
        }
        return parent[x];
    }

    int union(int a,int b){

        int pa=find(a);
        int pb=find(b);

        if(pa==pb) return 1;

        else if(rank[pa]<rank[pb]){
            parent[pa]=pb;
        }
        else if(rank[pa]>rank[pb]){
            parent[pb]=pa;
        }
        else{
            parent[pb]=pa;
            rank[pa]++;
        }
        return 0;
    }
    public int[] findRedundantConnection(int[][] edges) {
        

        int n=edges.length;
        parent=new int[n+1];
        rank=new int[n+1];
        for(int i=1;i<=n;i++){

            parent[i]=i;
            rank[i]=1;
        }
        for(int []node:edges){

            
            int res=union(node[0],node[1]);

            if(res==1){
                return new int[]{node[0],node[1]};
            }

        }
                return new int[]{-1,-1};
    }
}