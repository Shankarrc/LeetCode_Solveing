class Solution {

    void sortdiagonally(int mat[][],int row,int col){
        List<Integer> arr=new ArrayList<>();

        int rows=mat.length;
        int cols=mat[0].length;
        int i=row,j=col;
        while(rows>i && j<cols){
            arr.add(mat[i][j]);
            i++;
            j++;
        }
        Collections.sort(arr);
        i=row;j=col;
        int idx=0;
        while(i<rows && j<cols){
            mat[i][j]=arr.get(idx++);
            i++;
            j++;
        }
    }
    public int[][] diagonalSort(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        for(int j=0;j<m;j++) sortdiagonally(mat,0,j);
        for(int i=1;i<n;i++) sortdiagonally(mat,i,0);
        return mat;
    }
}