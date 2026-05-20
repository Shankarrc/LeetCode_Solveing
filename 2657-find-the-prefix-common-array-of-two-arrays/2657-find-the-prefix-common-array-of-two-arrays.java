class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        

        int n=A.length;
        int frq[]=new int[n+1];
        int ans[]=new int[n];
        int cnt=0;

        for(int i=0;i<n;i++){

            frq[A[i]]+=1;
            if(frq[A[i]]==2){
                cnt++;
            }
            
            frq[B[i]]+=1;
            if(frq[B[i]]==2){
                cnt++;
            }

            ans[i]=cnt;
        }
        return ans;
    }
}