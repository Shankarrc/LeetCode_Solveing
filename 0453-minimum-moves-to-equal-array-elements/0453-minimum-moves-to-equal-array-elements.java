class Solution {
    public int minMoves(int[] nums) {
        
        int min=Integer.MAX_VALUE;
        for(int a:nums){

                if(a<min)min=a;
        }
        int move=0;
        for(int a:nums){

            move+=a-min;
        }
        return move;
    }
}