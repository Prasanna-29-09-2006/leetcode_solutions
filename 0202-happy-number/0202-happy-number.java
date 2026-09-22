class Solution {
    public boolean isHappy(int n) {
        int slow=n,fast=n;
        while(true){
            slow=digit_sq_sum(slow);
            fast=digit_sq_sum(fast);
            fast=digit_sq_sum(fast);
            if(slow == fast ){
                if(slow==1) return true;
                else return false;
            } 
        }
        }
        int digit_sq_sum(int number){
            int digit=0,sum=0,n1=number;
            while(n1!=0){
                digit=n1%10;
                sum=sum+(digit*digit);
                n1=n1/10;
            }
            return sum;
    }
}