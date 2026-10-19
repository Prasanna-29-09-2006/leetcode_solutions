class Solution {
    public int addDigits(int num) {
        int sum=sumDigits(num);
        while(!(sum<10)){
            sum=sumDigits(sum);
        }
        return sum;
    }

    public static int sumDigits(int n){
        int dig=0,sum=0;
        while(n!=0){
            dig=n%10;
            sum = sum+dig;
            n=n/10;
        }
        return sum;

    }
}