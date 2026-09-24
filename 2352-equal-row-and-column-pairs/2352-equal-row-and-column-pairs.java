class Solution {
    public int equalPairs(int[][] grid) {

        HashMap<String,Integer>shan=new HashMap<>();
        for(int row[]:grid){
            String arr=Arrays.toString(row);
            shan.put(arr,shan.getOrDefault(arr,0)+1);
        }
        int cnt=0;
        int n=grid.length;

        for(int c=0;c<n;c++){

            int cols[]=new int[n];
            for(int r=0;r<n;r++){
                cols[r]=grid[r][c];
            }

            String arr=Arrays.toString(cols);
            
                cnt+=shan.getOrDefault(arr,0);
             
            
        }
        return cnt;

    }
}