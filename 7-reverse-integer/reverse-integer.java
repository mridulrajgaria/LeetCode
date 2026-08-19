class Solution {
    public int reverse(int x) {
        if(x>0){
            return rev(x);
        }else{
            return -rev(-x);
        }
        
    }
    public int rev(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            sum=sum*10+rem;
            n=n/10;
        }
        return sum;
    }
}