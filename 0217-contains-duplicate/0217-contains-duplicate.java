class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int x:nums) set.add(x);

        if(nums.length == set.size()) return false;

        else return true;
        
    }
}