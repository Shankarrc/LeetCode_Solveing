class Solution {
    public int minJumps(int[] arr) {

        int n=arr.length;
        
        HashMap<Integer,List<Integer>> shan=new HashMap<>();

        for(int i=0;i<n;i++){

            shan.computeIfAbsent(arr[i],k->new ArrayList<>())
                .add(i);
                  
        }
        Queue<Integer>q=new LinkedList<>();

        q.add(0);
        boolean vis[]=new boolean[arr.length];
        vis[0]=true;
        int step=0;
        while(!q.isEmpty()){

            int size=q.size();

            while(size-->0){
               int i=q.poll();

                if(i==n-1) return step;
                List<Integer>next=shan.get(arr[i]);
                next.add(i-1);
                next.add(i+1);
                for(int a:next){

                    if(  a>=0 && a<n &&!vis[a]){
                        q.add(a);
                        vis[a]=true;
                    }
                }


                shan.get(arr[i]).clear();
            }
            step++;
        }
        return step;
    }
}