class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int[] sorted = Arrays.stream(heights).sorted().toArray();
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=sorted[i]){
                count++;
            }
        }
        return count;
    }
}