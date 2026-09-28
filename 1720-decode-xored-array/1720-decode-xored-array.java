class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] nums=new int[encoded.length+1];
        nums[0]=first;
        for(int i=1;i<=encoded.length;i++){
            nums[i]=nums[i-1]^encoded[i-1];
        }
        return nums;
    }
}