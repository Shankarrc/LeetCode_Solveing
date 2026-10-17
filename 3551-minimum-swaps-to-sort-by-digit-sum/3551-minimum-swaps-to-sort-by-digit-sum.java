class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;

        Integer[] idx=new Integer[n];
        for(int i=0;i<n;i++) idx[i]=i;
        Arrays.sort(idx,(a,b)->{
            int da=digitSum(nums[a]);
            int db=digitSum(nums[b]);
            if(da!=db) return da-db;
            return nums[a]-nums[b];
        });
        boolean vis[]=new boolean [n];
        int swap=0;
        for(int i=0;i<n;i++){
            if(vis[i] || idx[i]==i) continue;
            int cycleLen=0;
            int j=i;
            while(!vis[j]){
                vis[j]=true;
                j=idx[j];
                cycleLen++;
            }
            swap+=cycleLen-1;
        }
        return swap;
    }

    public int digitSum(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}