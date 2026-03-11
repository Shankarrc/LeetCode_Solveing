class Solution {
    public int bitwiseComplement(int n) {
        
        String str=Integer.toBinaryString(n);
        StringBuilder st=new StringBuilder( );
            for(char c:str.toCharArray()){
                st.append(c=='0'?'1':'0');
            }
        String s=st.toString();
        int res=Integer.parseInt(s,2);
        return res;
    }
}