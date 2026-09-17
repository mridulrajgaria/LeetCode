class Solution {
    public int jump(int[] nums) {
        int count=0;
        int maxr=0;
        int end=0;
        for(int i=0;i<nums.length-1;i++){
            maxr=Math.max(maxr,i+nums[i]);
            if(i==end){
                count++;
                end=maxr;
            }
        }
        return count;
        
    }
}