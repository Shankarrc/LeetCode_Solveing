class Solution {
    public int numSpecial(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int rcount[]=new int [n];
        int ccount[]=new int [m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    rcount[i]++;
                    ccount[j]++;
                }
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(mat[i][j]==1){
                    if(ccount[j]==1 && rcount[i]==1){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}