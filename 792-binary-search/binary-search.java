class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        return bs(nums,low,high,target);
    }
    public int bs(int[] nums,int low,int high,int target){
        while(low<=high){
            int mid=low+((high-low)/2);
            if(target==nums[mid]){
                return mid;
            }else if(target>nums[mid]){
                return bs(nums,mid+1,high,target);
            }else{
                return bs(nums,low,mid-1,target);
            }
        }
        return -1;
    }
}