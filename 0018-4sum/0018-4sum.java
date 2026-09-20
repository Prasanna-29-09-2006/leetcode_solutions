class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        int left,right;long sum;
        for(int i=0;i<nums.length-3;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length-2;j++){
                if(j!=i+1 && nums[j]==nums[j-1]) continue;
                left=j+1;
                right=nums.length-1;
                while(left<right){
                    sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        outer.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[left],nums[right])));
                        while(left<right && nums[left]==nums[left+1]){
                            left++;
                        }
                        while(left<right && nums[right]==nums[right-1]){
                           right--;
                        }
                        left++;
                        right--;
                    }
                    else if(sum<target){
                         left++;
                    }
                    else if(sum>target){
                        right--;
                    }  
                }
            }
        }
        return outer;
    }
}