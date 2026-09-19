class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        int left,right;
        for(int i=0;i<nums.length-2;i++){
            if(i!=0){
                if(nums[i]==nums[i-1]) continue;
            }
            left=i+1;
            right=nums.length-1;
            while(left<right){
                if((nums[i]+nums[left]+nums[right])==0){
                        outer.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right]))); 
                while(left<right && nums[left]==nums[left+1]) {
                    left++;
                }   
                while(left<right && nums[right]==nums[right-1]) {
                    right--;
                }    

                left++;
                right--;
            }
            else if((nums[i]+nums[left]+nums[right])<0){
                left++;
            }
            else if((nums[i]+nums[left]+nums[right])>0){
                right--;
            }
            }
        }
        return outer;
    }
}