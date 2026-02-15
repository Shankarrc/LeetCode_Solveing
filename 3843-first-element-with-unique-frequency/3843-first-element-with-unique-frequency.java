class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer>ans=new HashMap<>();

        for(int a:nums){
            ans.put(a,ans.getOrDefault(a,0)+1);
        }
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int a:ans.values()){
            freq.put(a,freq.getOrDefault(a,0)+1);
        }
        for(int a:nums){
            int val=ans.get(a);
            if(freq.get(val)==1)return a;
        }
        return -1;
    }
}