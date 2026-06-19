class Solution {
    public int largestAltitude(int[] gain) {
        
        int maxval=0;

        int curr=0;
        for(int a:gain){

            curr+=a;

            maxval=Math.max(curr,maxval);
        }
        return maxval;
    }
}