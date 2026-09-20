class Solution {
    public int reverseDegree(String s) {
        
        int sum=0;
        int j=1;
        for(int i=0;i<s.length();i++){

        int  val=26-(s.charAt(i)-'a') ;
            sum+=(val*j);
            j++;
            System.out.println(sum);
        }
        return sum;
    }
}