class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(true){
            int digSum = digSqSum(n);
            if(digSum == 1) return true;
            else{
                if(!set.contains(digSum)) set.add(digSum);
                else return false;
            }
            n = digSum;
        }  
    }

    public int digSqSum(int num){
        int dig=0,sum=0;
        while(num!=0){
            dig =num%10;
            sum = sum+(dig*dig);
            num = num/10;
        }
        return sum;
    }
}