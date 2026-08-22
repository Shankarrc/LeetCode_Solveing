class Solution {
    public boolean checkDivisibility(int n) {
        
        int sum=0;
        int prod=1;
        int t=n;
        while(n>0){
            int d=n%10;
            sum+=d;
            prod*=d;
            n/=10;
        }
        if(t%(sum+prod)==0){

            
                return true;

            
        }
        return false;
    }
}