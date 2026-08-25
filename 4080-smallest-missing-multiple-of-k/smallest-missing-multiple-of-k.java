class Solution {
    public int missingMultiple(int[] nums, int k) {
        int[] multi=new int[nums.length];
        for(int i=0;i<multi.length;i++){
            multi[i]=k*(i+1);
        }
        for(int i=0;i<multi.length;i++){
            boolean f=false;
            for(int j=0;j<nums.length;j++){
                if(multi[i]==nums[j]){
                    f=true;
                    break;
                }
            }
            if(f==false){
                return multi[i];
            }
        }
        return k*(nums.length+1);
    }
}