class Solution {
    public int maxProduct(int n) {
        int max1=-1;int max2=-1;
        int rem=0;
        int temp=0;
        while(n>0){
            rem=n%10;
            if(rem>max1){
                temp=max1;
                max1=rem;
                max2=temp;
            }
            else if(rem>max2){
                max2=rem;
            }
            n=n/10;
        }
        return (max1*max2);
    }
}