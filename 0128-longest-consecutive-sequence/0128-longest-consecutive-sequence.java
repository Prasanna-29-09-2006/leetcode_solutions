class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new TreeSet<>();
        for(int x : nums) set.add(x);

        int left=0,right=0,i=0,count=1,maxCount=0;

        for(Integer y : set){
            if(i==0){
                left=y;
                i++;
            }
            else if(i==1){
                right=y;
                if(right-left == 1) count++;
                maxCount = count;
                left=right;
                i++;
            }
            else{
                right=y;
                if(right-left == 1){
                    count++;
                }
                else{
                    if(count>maxCount){
                        maxCount = count;
                    }
                    count = 1;
                }
                left=right;
                i++;
            }   
    }
    if(count>maxCount) maxCount = count;
                       
    return maxCount;
}
}