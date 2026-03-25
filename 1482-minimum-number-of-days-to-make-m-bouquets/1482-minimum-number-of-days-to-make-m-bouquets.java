class Solution {
    public boolean check(int maxx,int arr[],int m,int k){

         
        int sum=0;
    int b=0;

        for(int a:arr){


            if(a<=maxx){
                sum++;

                if(sum==k){
                    b++;
                    sum=0;
                }
            }
            else{
                sum=0;
            }

        }
        return b>=m;
    }
    public int minDays(int[] arr, int m, int k) {
        if((long)m*k>arr.length) return -1;
        int low=Integer.MAX_VALUE;;
        int high=Integer.MIN_VALUE;
        for(int a:arr){
            high=Math.max(high,a);
            low=Math.min(low,a);
        }

        
        while(low<=high){

            int mid=low+(high-low)/2;

            if(check(mid,arr,m,k)){
              
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}