
class Solution {
    public boolean hasDuplicate(int[] nums) {
        java.util.HashSet<Integer>s = new java.util.HashSet<>();
        for(int num : nums){
         if(s.contains(num)){
            return true;
         }
         s.add(num);
        }
        return false;
    }
}