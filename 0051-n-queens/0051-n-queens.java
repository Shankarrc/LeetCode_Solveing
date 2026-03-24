class Solution {
    public int n;
    public boolean issafe(boolean chess[][],int row,int col){
        int i=row;
        int j=col;

        while(i>=0){
            if(chess[i--][j]) return false;
        }
        i=row;
        j=col;
        while(i>=0 && j>=0){

            if(chess[i--][j--]) return false;
        }
        i=row;
        j=col;

        while(i>=0 && j<n){
            if(chess[i--][j++]) return false;
        }
        return true;
    }
    public List<List<String>> rec(int row,boolean [][]chess){
        List<List<String>> res=new ArrayList<>();
        if(row==n){
            List<String>temp=new ArrayList<>();

            for(int i=0;i<n;i++){
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<n;j++){

                    if(chess[i][j]){
                        sb.append("Q");
                    }
                    else{
                        sb.append(".");
                    }
                }
                temp.add(sb.toString());
            }

        res.add(temp);
        return res;
        }

        for(int col=0;col<n;col++){

            if(issafe(chess,row,col)){
                chess[row][col]=true;
                res.addAll(rec(row+1,chess));
                chess[row][col]=false;
            }
        }
        return res;
        
    }
    public List<List<String>> solveNQueens(int n) {
        this.n=n;

        boolean chess[][]=new boolean[n][n];
        return rec(0,chess);
    }
}