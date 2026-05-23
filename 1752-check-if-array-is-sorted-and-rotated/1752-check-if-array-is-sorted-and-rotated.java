class Solution {
    public boolean check(int[] nums) {
        

        int []arr=nums.clone();

        Arrays.sort(arr);
        boolean check=true;
        int l=0;
            int n=nums.length;
            while(l<n){

                int temp=nums[0];
                for(int i=1;i<n;i++){
                    nums[i-1]=nums[i];
                }
                nums[n-1]=temp;
                check=true;
                for(int i=0;i<n;i++){

                    if(arr[i]!=nums[i]) check=false;
                }
                if(check) break;
            l++;

            }
            return check;
    }
}