class Solution {
    public String convert(String s, int numRows) {
         if(s.length()<=numRows ||numRows==1){
                return s;
            }
        StringBuilder sh[]=new StringBuilder[numRows];

        for(int i=0;i<numRows;i++){
            sh[i]=new StringBuilder();
        }
        int row=0;
        boolean down=true;

           
        for(char ch:s.toCharArray()){

            sh[row].append(ch);

            if(row==numRows-1){
                down=false;
            }
            else if(row==0){
                down=true;
            }
            if(down){
                row++;

            }
            else{
                row--;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(StringBuilder sb:sh){
            ans.append(sb);
        }
        return ans.toString();
    }
}