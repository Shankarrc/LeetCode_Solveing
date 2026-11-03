class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int a:nums){
            if(max<a)max=a;
        }
        int move=0;
        for(int a:nums){
            move+=max-a;

        }
        return move;
    }
}