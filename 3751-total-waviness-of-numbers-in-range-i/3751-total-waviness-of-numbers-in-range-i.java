class Solution {
    public int totalWaviness(int num1, int num2) {
        int tot=0;
        for(int i=num1;i<=num2;i++){

            String str=String.valueOf(i);

            int n=str.length();
            if(n<3) continue;
            for(int j=1;j<n-1;j++){

                if(str.charAt(j-1)>str.charAt(j)&& str.charAt(j+1)>str.charAt(j)) tot++;
                else if(str.charAt(j-1)<str.charAt(j)&& str.charAt(j+1)<str.charAt(j)) tot++;
            }
        }
            return tot;
    }
}