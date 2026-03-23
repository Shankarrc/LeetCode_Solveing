class Solution {
    public boolean check(int arr[],int days,int cap){

        int cnt=1;
        int sum=0;
        for(int a:arr ){

            if(a+sum>cap){
                cnt++;
                sum=0;
            }
            sum+=a;
        }
     return cnt<=days?true:false;
    }
    public int shipWithinDays(int[] weights, int days) {
        
        int low=0;
        int high=0;
        for(int i=0;i<weights.length;i++){
            high+=weights[i];
            low=Math.max(low,weights[i]);
        }
        int ans=high;
        while(low<=high){

            int mid=(low+high)/2;

            if(check(weights,days,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}