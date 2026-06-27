class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        

        HashMap<Integer,Integer>shan=new HashMap<>();

        for(int a:nums){

            shan.put(a,shan.getOrDefault(a,0)+1);
        }
        List<Integer>[] arr=new List[nums.length+1];

        for(int key:shan.keySet()){
            

            int freq=shan.get(key);
            if(arr[freq]==null){
                arr[freq]=new ArrayList<>();
            }
            arr[freq].add(key);
        }
        int ans[]=new int[k];
        int cnt=0;

        for(int i=arr.length-1;i>=0 &&cnt<k;i--){

            if(arr[i]!=null){

                for(Integer l:arr[i]){
                    ans[cnt++]=l;
                }
            }

            
        }
        return ans;
    }
}