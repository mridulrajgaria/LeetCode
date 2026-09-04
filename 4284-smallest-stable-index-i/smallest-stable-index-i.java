class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            int min=Integer.MAX_VALUE;
            for(int j=i;j<nums.length;j++){
                if(nums[j]<min){
                    min=nums[j];
                }
            }
            int instability=max-min;
            if(instability<=k){
                return i;
            }
        }
        return -1;
    }
}