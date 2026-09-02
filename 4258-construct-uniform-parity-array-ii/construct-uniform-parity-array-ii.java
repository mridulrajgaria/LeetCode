class Solution {
    int inf = (int) 1e9; 
    public boolean uniformArray(int[] nums1) {
        // ALL EVEN - TRUE 
        // ALL ODD - TRUE 
        // WHEN MIXED 
        // We can only subtract strictly smaller 
        
        boolean odd = false, even = false; 
        int mn = inf; 
        for(int i = 0; i < nums1.length; i++) {
            if(nums1[i] % 2 == 0) even |= true; 
            else odd |= true; 
            mn = Math.min(mn, nums1[i]); 
        }

        if(!odd || !even) return true; // only 1 kind in array 





return mn % 2 == 1; 
    }
}