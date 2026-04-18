class Solution {
    public int mirrorDistance(int n) {
        int res=0;
        int N=n;
        while(N>0){
        int ren=N%10;
            res=(res*10)+ren;
            N=N/10;
        }
        return Math.abs(res-n);
    }
}