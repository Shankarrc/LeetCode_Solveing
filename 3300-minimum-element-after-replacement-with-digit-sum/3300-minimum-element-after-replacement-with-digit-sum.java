class Solution {
    public int minElement(int[] nums) {
        
        int minn=Integer.MAX_VALUE;
        for(int a:nums){

          int  res=0;
            while(a>0){
                int digit=a%10;
                res+=digit;
                a/=10;
            }
            minn=Math.min(minn,res);


        }
        return minn;
    }
}