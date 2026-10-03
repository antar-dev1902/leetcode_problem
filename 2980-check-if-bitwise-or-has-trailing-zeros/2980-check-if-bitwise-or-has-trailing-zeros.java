class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int ans=nums[i] | nums[j];
                if((ans&1)==0){
                    count=1;
                }
                
            }
        }
        if(count==1){
            return true;
        }
        return false;
        
    }
}