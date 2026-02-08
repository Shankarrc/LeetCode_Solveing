class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
        int n1=nums1.length;

        Stack<Integer>st=new Stack<>();
        int num[]=new int[n];
        Arrays.fill(num,-1);
        for(int i=n-1;i>=0;i--){

            while(!st.isEmpty() && nums2[st.peek()]<nums2[i]){
            st.pop();
            }
            if(!st.isEmpty()) num[i]=nums2[st.peek()];
            st.push(i);
        }
        int res[]=new int[n1];
        for(int i=0;i<n1;i++){

            for(int j=0;j<n;j++){
                
                if(nums1[i]==nums2[j]){
                    res[i]=num[j];
                }
            }
        }
        return res;
    }
}