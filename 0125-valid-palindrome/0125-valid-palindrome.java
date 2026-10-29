class Solution {
    public boolean isPalindrome(String s) {
        /*
        this approach uses 2 pointer pattern  T.C : o(n) ; S.C : O(1)
        and the condition checking(uppercase,lowercase,digit) is done using characters' ASCII  values
        */
        int left=0,right=s.length()-1;
        while(left<=right){
            if((s.charAt(left)>=65 &&s.charAt(left)<=90)||(s.charAt(left)>=97 &&s.charAt(left)<=122) ||(s.charAt(left)>='0' &&s.charAt(left)<='9')){
                if((s.charAt(right)>=65 &&s.charAt(right)<=90)||(s.charAt(right)>=97 &&s.charAt(right)<=122) ||(s.charAt(right)>='0' &&s.charAt(right)<='9')){
                    if((s.charAt(left)>=65 &&s.charAt(left)<=90) && (s.charAt(right)>=97 &&s.charAt(right)<=122)){
                        if(((char)(s.charAt(left)+32))==s.charAt(right)){
                            left++;
                            right--;
                        }
                        else return false;
                    }
                    else if((s.charAt(left)>=97 &&s.charAt(left)<=122) && (s.charAt(right)>=65 &&s.charAt(right)<=90)){
                        if(((char)(s.charAt(right)+32))==s.charAt(left)){
                            left++;
                            right--;
                        }
                        else return false;
                    }
                    else{
                        if(s.charAt(left)==s.charAt(right)){
                            left++;
                            right--;
                        }
                        else return false;
                    }


                }
                else{
                    right--;
                }
                
            }
            else{
                left++;
            }
        }
        return true;
        
    }
}