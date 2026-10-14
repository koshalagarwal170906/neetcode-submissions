class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low =0;
        for(int i =0;i<weights.length;i++){
            low = Math.max(weights[i],low);
        }
        int high =0;
        for(int i =0;i<weights.length;i++){
            high += weights[i];
        }
        while(low<=high){
            int mid = low + (high-low)/2;
            int daysNeeded = 1;
            int currload = 0;

            for(int weight : weights){
                    if((currload+weight)<=mid){
                    currload+=weight;
                    }
                    else{
                        daysNeeded++;
                        currload = weight;
                    }
            }

           if(daysNeeded <= days){
            high = mid-1;
           }    
           else{
            low = mid+1;
           }     
            
        }
        return low;
    }
}