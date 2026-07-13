class Solution {
    public int twoCitySchedCost(int[][] costs) {
        
        Arrays.sort(costs,(a,b)->(a[1]-a[0])-(b[1]-b[0]));
        int ans=0;
        int n=costs.length;
        int m=n/2;
        for(int i=0;i<m;i++){
            ans+=costs[i][1];
        }
        for(int i=m;i<m*2;i++){
            ans+=costs[i][0];
        }
        return ans;
    }
}