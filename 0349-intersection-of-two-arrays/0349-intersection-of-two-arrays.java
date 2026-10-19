class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int left=0,right=0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list = new ArrayList<>();
        
        while(left<nums1.length && right<nums2.length){
            if(nums1[left] == nums2[right]){
                list.add(nums1[left]);
                while(left<nums1.length-1 && nums1[left]==nums1[left+1]) left++;
                left++;
                while(right<nums2.length-1 && nums2[right]==nums2[right+1]) right++;
                right++;
            }
            else if(nums1[left] < nums2[right]) left++;
            else right++;
        }
        int[] obj = new int[list.size()];
        for(int i =0;i<obj.length;i++){
            obj[i]=list.get(i);
        }
        return obj;
    }
}