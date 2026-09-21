class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int n1=n,digit=0,sum=0;
        while(true){
            while(n1!=0){
                digit =n1%10;
                sum=sum+(digit*digit);
                n1=n1/10;
            }
            if(sum==1) return true;
            else if(set.contains(sum)) return false;
            else set.add(sum);
            n1=sum;
            sum=0;
        }
    }
}