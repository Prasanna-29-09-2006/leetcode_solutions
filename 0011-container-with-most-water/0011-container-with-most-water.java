class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1,area=0,max_area=0;
        while(left<right){
            if(height[left]<=height[right]){
                area=(height[left])*(right-left);
                left++;
            }
            else if(height[left]>height[right]){
                area=(height[right])*(right-left);
                right--;
            }
            if(area>max_area) max_area=area;
        }
        return max_area;
        
    }
}