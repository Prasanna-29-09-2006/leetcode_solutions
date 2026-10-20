class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hset1 = new HashSet<>();

        for(int x : nums1) hset1.add(x);

        Set<Integer> hset2 = new HashSet<>();

        for(int y : nums2) hset2.add(y);

        hset1.retainAll(hset2);

        int[] obj = new int[hset1.size()];

        int i = 0;
        for(Integer z : hset1){
            obj[i] =z;
            i++; 
        }

        return obj;
        
    }
}