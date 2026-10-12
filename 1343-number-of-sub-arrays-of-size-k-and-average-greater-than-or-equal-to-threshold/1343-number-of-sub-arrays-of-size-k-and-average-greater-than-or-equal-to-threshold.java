class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum =0, count = 0;
        double avg = 0;
        for(int i =0;i < k ;i++){
            sum+=arr[i];
        }
        avg =(double)sum/k;
        if(avg >=(double)threshold) count++;
        for(int i =k;i<arr.length;i++){
            sum = sum-(arr[i-k])+arr[i];
            avg =(double)sum/k;
            if(avg >=(double)threshold) count++;
        }
        return count;
    }
}