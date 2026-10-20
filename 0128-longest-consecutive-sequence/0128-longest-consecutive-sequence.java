class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Boolean> map = new HashMap<>();
        int count=0,maxCount=0;

        for(int x : nums) map.put(x,false);

        for(int y : nums){
            if(map.get(y)==false){
                map.put(y,true);
                count++;
                int temp=0;
                if(y<Integer.MAX_VALUE){ 
                     temp = y+1;
                while(true){
                    if(map.containsKey(temp)){
                        map.put(temp,true);
                        count++;
                        if(temp<Integer.MAX_VALUE) temp++;
                        else break;
                        
                    }
                    else break;
                }
                }
                if(y>Integer.MIN_VALUE){ 
                temp=y-1;
                while(true){
                    if(map.containsKey(temp)){
                        map.put(temp,true);
                        count++;
                       if(temp>Integer.MIN_VALUE) temp--;
                       else break;
                    }
                    else break;
                }
                }

            }
            if(count>maxCount) maxCount=count; 
            count = 0;
        }
        return maxCount;


        
    }
}