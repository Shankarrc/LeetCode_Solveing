class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        

        HashMap<Integer,Integer>prefix=new HashMap<>();

        prefix.put(0,0);
        int n=nums.length;
        int pre=0;
        for(int i=0;i<n;i++){

            pre=(pre+nums[i])%k;

            if(prefix.containsKey(pre)){

                if(i+1-prefix.get(pre)>=2){
                    return true;
                }
               
            }
             else{
                    prefix.put(pre,i+1);
                }
        }
        return false;
    }
}