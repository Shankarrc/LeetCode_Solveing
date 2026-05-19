class Solution {
    public int minJumps(int[] arr) {
        
        HashMap<Integer,List<Integer>>shan=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            shan.computeIfAbsent(arr[i],k->new ArrayList<>()).add(i);
        }

        Queue<Integer>q=new LinkedList<>();
        int n=arr.length;
        q.add(0);
        boolean[]vis=new boolean[n];
        vis[0]=true;
        int step=0;
        while(!q.isEmpty()){

            int size=q.size();

            while(size-->0){

                int i=q.poll();

                if(i==n-1) return  step;

                List<Integer> nextval=shan.get(arr[i]);
                nextval.add(i-1);
                nextval.add(i+1);
                for(int val:nextval){

                    if(val>=0 && val<n && !vis[val]){
                        vis[val]=true;
                        q.add(val);
                    }
                }
                shan.get(arr[i]).clear();
            }
            step++;
        }
        return step;
    }
}