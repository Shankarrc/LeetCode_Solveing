class Solution {
   
    public boolean check(int cnt){
       if(cnt==2 || cnt==3 ||cnt==5||cnt==7|| cnt==11||cnt==13||cnt==17||cnt==19 ){
            return true;
        }
        return false;
    }
    public int countPrimeSetBits(int left, int right) {
        

            int ans=0;
        for(int i=left ;i<=right;i++){

            int str=Integer.bitCount(i);

            if(check(str)){
                ans++;
            }
        }
        return ans;
    }
}