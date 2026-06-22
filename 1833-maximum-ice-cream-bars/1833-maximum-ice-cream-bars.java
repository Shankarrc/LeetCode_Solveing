class Solution {
    public int maxIceCream(int[] costs, int coins) {
        
        Arrays.sort(costs);
        int cnt=0;
        int sum=0;

        for(int a:costs){

            if(a+sum>coins) break;
            
                sum+=a;
              cnt++;
        }
        return cnt;
    }
}