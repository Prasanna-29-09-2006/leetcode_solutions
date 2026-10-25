class Solution {
    public int strStr(String haystack, String needle) {
        //slightly efficient appraoch than the bruteforce approach
        for(int i=0;i<haystack.length();i++){
            int count=0;
            if(haystack.charAt(i)==needle.charAt(0)){
                int index=i,j=0;
                while(index<haystack.length() && j<needle.length() && haystack.charAt(index)==needle.charAt(j)){
                    count++;
                    if(count==needle.length()) return i;
                    index++;
                    j++;
                }
            }
        }
        return -1;
        
    }
}