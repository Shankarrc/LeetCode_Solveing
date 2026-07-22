class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>shan=new HashMap<>();

        shan.put(0,-1);
        int n=nums.length;
        int one=0,zero=0,maxlen=0;
        for(int i=0;i<n;i++){

            if(nums[i]==1){
                one++;
            }
            else{
                zero++;
            }
            int diff=zero-one;

            if(shan.containsKey(diff)){
                maxlen=Math.max(maxlen,i-shan.get(diff));
            }
            else{
                shan.put(diff,i);
            }
        }
        return maxlen;
    }
}