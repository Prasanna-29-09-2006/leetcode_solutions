class Solution {
    public boolean isPalindrome(String s) {
        char[] obj = s.toCharArray();
        List<Character> list =new ArrayList<>();
        char ch=' ';
        int left,right;
        for(char x:obj){
            if(x>='A' && x<='Z'){
                ch=Character.toLowerCase(x);
                list.add(ch);
            }
            else if(x>='a' && x<='z'){
                list.add(x);
            }
            else if(x>='0' && x<='9'){
                list.add(x);
            }
        }
        left=0;right=list.size()-1;
        while(left<=right){
            if(list.get(left)!=list.get(right)){
                return false;
            }
            left++;
            right--;
        }
        return true; 
    }
}