class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0,right=k-1,sum=0;
        double avg=0,max_avg=0;
        for(int i=left;i<=right;i++){
                sum=sum+nums[i];
            }
        max_avg=(double)sum/k;
        while(right<nums.length){
            avg=(double)sum/k;
            if(avg>max_avg){
                max_avg=avg;
            }
            sum=sum-nums[left];
            left++;
            right++;
            if(right<nums.length)
                sum=sum+nums[right];
        }
        return max_avg;        
    }
}