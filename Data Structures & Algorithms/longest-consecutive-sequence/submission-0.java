class Solution {
    public int longestConsecutive(int[] nums) {
     HashSet<Integer>s = new HashSet<>();  
     for(int num :  nums){
        s.add(num);
     } 
     int maxLen = 0;
     for(Integer i : s ){
        int prev = i -1;
        if(!s.contains(prev)){
         int len = 1;
         int next = i +1;
         while(s.contains(next)){
            len++;
            next++;
         }
         maxLen = Math.max(maxLen , len);
        }
        
     }
     return maxLen;
    }
}
