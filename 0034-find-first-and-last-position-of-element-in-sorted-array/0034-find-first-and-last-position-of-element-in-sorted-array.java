class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int x=-1;
        int y=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                x=mid;
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                y=mid;
                high=mid-1;
            }
            else if(nums[mid]>target){
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
        return new int[]{y,x};
        
    }
}