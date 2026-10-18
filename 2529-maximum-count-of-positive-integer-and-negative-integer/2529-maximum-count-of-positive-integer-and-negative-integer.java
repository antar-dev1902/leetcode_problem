class Solution {
    public int maximumCount(int[] nums) {
        int max=0;
        int min=0;
        for(int i:nums){
            if(i<0){
                min++;
            }else if(i>0){
                max++;
            }
        }
        return Math.max(max,min);
    }
}