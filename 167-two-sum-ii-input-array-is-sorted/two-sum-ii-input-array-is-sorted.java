class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length;i++){
            int low=0;
            int high=numbers.length-1;
            while(low<high){
                int diff=numbers[high]+numbers[low];
                if(diff==target){
                    return new int[]{low+1,high+1};
                }else if(diff>target){
                    high--;
                }else{
                    low++;
                }
            }
        }
        return new int[]{-1,-1};
    }
}