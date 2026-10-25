class Solution {
    public int strStr(String haystack, String needle) {
        int index=0,count=0;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            index=i;
            count=0;
            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(index)==needle.charAt(j)){
                    count++;
                    if(count==needle.length()){
                        return i;
                    }
                    index++;
                }
                else{
                    break;
                }
            }
        }
        return -1;
    }
}