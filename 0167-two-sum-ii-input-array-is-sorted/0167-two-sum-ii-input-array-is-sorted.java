class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0,right=numbers.length-1;
        int[] obj = new int[2];
        while(left<right){
            if(numbers[left]+numbers[right]==target){
                obj[0]=left+1;
                obj[1]=right+1;
                break;
            } 
            else if((numbers[left]+numbers[right])>target){
                right--;
            }
            else left++;
        }
        return obj;
        
    }
}