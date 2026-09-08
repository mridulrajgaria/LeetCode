class Solution {
    public int countCommas(int n) {
        int diff=0;
        diff=n-1000;
        if(diff>=0){
            return diff+1;
        }
        return 0;


        
    }
}