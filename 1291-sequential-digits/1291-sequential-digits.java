class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        String s="123456789";
        List<Integer>ans=new ArrayList<>();

        for(int len=2;len<=9;len+=1){

            for(int i=0;i<=9-len;i++){

                String str=s.substring(i,i+len);
                int val=Integer.parseInt(str);
                if(val>=low && val<=high){
                    ans.add(val);
                }
            }

        }
        return ans;
    }
}