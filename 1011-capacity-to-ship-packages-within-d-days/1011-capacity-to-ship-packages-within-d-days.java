class Solution {
    public boolean check(int maxx,int w[],int days){
        int d=1;
        int sum=0;
        for(int a:w){
            if(a+sum>maxx){
                sum=0;
                d+=1;
            }
            sum+=a;
        }
        return d<=days;
    }
    public int shipWithinDays(int[] w, int days) {
        int low=0;
        int high=0;
        for(int i=0;i<w.length;i++){
            if(low<w[i])low=w[i];
            high+=w[i];
        }
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(check(mid,w,days)){
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