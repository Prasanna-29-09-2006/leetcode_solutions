class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int left,right,sum,closest=0,overall_closest=0,diff,min_diff=Integer.MAX_VALUE,overall_min_diff=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            left=i+1;
            right=nums.length-1;
            min_diff=Integer.MAX_VALUE;
            while(left<right){
                sum=nums[i]+nums[left]+nums[right];
                if(sum == target) return target;
                else if(sum>target) right--;
                else left++;
                diff=Math.abs(sum-target);
                if(diff<min_diff) {
                    min_diff=diff;
                    closest=sum;
                }
            }
            if(min_diff<overall_min_diff){
                overall_min_diff=min_diff;
                overall_closest=closest;
            }
            
        }
        return overall_closest;
    }
}