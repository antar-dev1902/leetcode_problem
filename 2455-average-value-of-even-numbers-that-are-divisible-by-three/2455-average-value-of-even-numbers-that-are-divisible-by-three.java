class Solution {
    public int averageValue(int[] nums) {
        int avg=0;
        int count=0;
        for(int i:nums){
            if(i%2==0 && i%3==0){
                avg+=i;
                count++;
            }
        }
        if(count==0){
            return 0;
        }
        return avg/count;
    }
}