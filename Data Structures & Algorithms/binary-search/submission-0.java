class Solution {
    public int search(int[] nums, int target) {
      int i  = 0;
      int j = nums.length;
      while(i<j){
        if(nums[i]== target){
          return i;
        }
        if(nums[i] > target ){
            j--;
        }
        else{
            i++;
        }
      }
       return -1;
    }
}
