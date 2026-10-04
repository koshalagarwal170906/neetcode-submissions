class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l =0;
        int r =0;
        int maxLength = 0;
        int hash[] = new int[256];
        Arrays.fill(hash,-1);
        while(r < s.length()){
            char ch = s.charAt(r);
            if(hash[ch] != -1){
                if(hash[ch]>=l){
                    l = hash[ch]+1;
                }
            }
            maxLength = Math.max(maxLength, r-l+1);
            hash[ch] = r;
            r++;
        }
        return maxLength;
    }
}
