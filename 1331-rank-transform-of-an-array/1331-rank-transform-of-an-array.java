class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int n=arr.length;
        int nums[]=arr.clone();
         
        HashMap<Integer,Integer>shan=new HashMap<Integer,Integer>();
        Arrays.sort(arr);
        int rank=1;
        for(int a:arr){

            if(!shan.containsKey(a)){
                shan.put(a,rank++);
            }
        }
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=shan.get(nums[i]);
        }
        return res;
         
      
    }
}