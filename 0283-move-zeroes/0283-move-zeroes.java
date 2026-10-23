class Solution {
    public void moveZeroes(int[] nums) {
        int slow=0,fast=1,temp=0;
        while(fast<nums.length){
            if(nums[slow]==0){
                while(fast<nums.length){
                    if(nums[fast]==0)
                        fast++;
                    else break;
                }
                if(fast==nums.length) return;
                temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
                fast++;
            }
            else{
                slow++;
                fast++;
            }
        }
    }
}