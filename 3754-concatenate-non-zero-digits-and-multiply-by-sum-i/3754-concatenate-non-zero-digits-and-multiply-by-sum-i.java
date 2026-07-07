class Solution {
    public long sumAndMultiply(int n) {
        
        if(n==0) return 0;
       
        long ans=0;
        long product=1;
        long result=0;
        while(n>0){

            long res=n%10;

            if(res!=0){
                 ans+=res;
                 result+=product*res;
                 product=product*10;
            }
            n=n/10;
        }
        return result*ans;
    }
}