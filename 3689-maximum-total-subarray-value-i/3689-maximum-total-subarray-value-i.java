class Solution {
    public long maxTotalValue(int[] nums, int k) {
        
        int minn=Integer.MAX_VALUE;
        int maxx=Integer.MIN_VALUE;

        for(int a:nums){
            minn=Math.min(minn,a);
            maxx=Math.max(maxx,a);
        }
        long res=maxx-minn;
        return res*k;
    }
}