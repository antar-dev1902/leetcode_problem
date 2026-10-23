class Solution {
    int count(int n){
        if(n==0){
            return 0;
        }
        return n%10 +count(n/10);
    }
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=count(nums[i]);
        }
        int x=nums[0];
        for(int i:nums){
            x=Math.min(x,i);
        }
        return x;
        
    }
}