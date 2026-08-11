class Solution {
    public int missingInteger(int[] nums) {
        //1 3 4 5 12 13 14
        int tot=nums[0];
       for(int i=1;i<nums.length;i++){

        if(nums[i]==nums[i-1]+1){
            tot+=nums[i];
        }
        else {
            break;
        }
       }

       HashSet<Integer>set=new HashSet<>();

       for(int a:nums){
        set.add(a);

       }
       while(set.contains(tot)){
        tot++;
       }
       return tot;
    }
}