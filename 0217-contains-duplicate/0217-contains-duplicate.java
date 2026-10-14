class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0) return false;

        Set<Integer> set = new HashSet<>();
        
        /* set.add() method returns boolean value; if it returns true, 
		 * the element is successfully added to the set which means the element is unique.
		 * But if it return false ,the element is not added to the set as the element is duplicate(already added)
		 */
        for(int x : nums){
           if (set.add(x)) continue;
           else return true;
        }
        return false;
}
}
