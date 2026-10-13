class Solution {
    static int unit(int n){
        if(n==0){
            return 0;
        }
        return n%10+unit(n/10);
    }
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digi=0;
        for(int i:nums){
            sum+=i;
            digi+=unit(i);
        }
        return Math.abs(sum-digi);
        
    }
}