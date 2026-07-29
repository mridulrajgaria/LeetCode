class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=square(slow);
            fast=square(square(fast));
        }while(slow!=fast);
        if(slow==1){
            return true;
        }
        return false;
    }
    public int square(int a){
        int rem;
        int sum=0;
        while(a>0){
            rem=a%10;
            sum+=(rem*rem);
            a=a/10;
        }
        return sum;
    }
}