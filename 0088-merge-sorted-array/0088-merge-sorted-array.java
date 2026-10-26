class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lmax=m-1,rmax=n-1,end=m+n-1;
        while(lmax>=0 && rmax>=0){
            if(nums1[lmax]>=nums2[rmax]){
                nums1[end]=nums1[lmax];
                end--;
                lmax--;
            }
            else if(nums1[lmax]<nums2[rmax]){
                nums1[end]=nums2[rmax];
                end--;
                rmax--;
            }
        }
        if(lmax<0){
            for(int i=0;i<=rmax;i++) nums1[i] = nums2[i];
        }
        else if(rmax<0){
            for(int i=0;i<=lmax;i++) nums1[i] = nums1[i];
        }
    }
}