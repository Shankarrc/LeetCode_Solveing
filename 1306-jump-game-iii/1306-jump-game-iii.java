class Solution {
    public boolean canReach(int[] arr, int start) {
        
        Queue<Integer>q=new LinkedList<>();
        q.add(start);
        boolean vis[]=new   boolean[arr.length];
        vis[start]=true;

        while(!q.isEmpty()){
            int curr=q.poll();
            if(arr[curr]==0) return true;
            int val[]={curr+arr[curr],curr-arr[curr]};
            for(int a:val){

                if(a>=0 && a<arr.length && !vis[a]){
                    q.add(a);
                    vis[a]=true;
                }
            }

        }
        return false;
    }
}