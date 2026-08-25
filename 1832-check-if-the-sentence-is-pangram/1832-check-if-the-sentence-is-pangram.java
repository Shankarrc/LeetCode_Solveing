class Solution {
    public boolean checkIfPangram(String s) {
        boolean par[]=new boolean[26];
        int n=s.length();
        int cnt=0;
        for(int i=0;i<n;i++){
            int idx=-1;
            char c=s.charAt(i);
            if(c>='a'&&c<='z'){
                idx=c-'a';
            }
            else if(c>='A' && c<='Z'){
                idx=c-'A';

            }
            if(idx!=-1 && !par[idx]){
                par[idx]=true;
                cnt++;

                if(cnt==26) return true;
            }
        }
        return false;
    }
}