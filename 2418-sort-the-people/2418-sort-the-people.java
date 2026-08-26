class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> shan=new TreeMap<>(Collections.reverseOrder());

        for(int i=0;i<names.length;i++){
            shan.put(heights[i],names[i]);
        }
        String[] ans=new String[names.length];
        int i=0;
        for(int key:shan.keySet()){
            ans[i++]=shan.get(key);
        }
        return ans;
    }
}