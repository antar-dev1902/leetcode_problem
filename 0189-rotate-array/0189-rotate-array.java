
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] a = new int[k];
        int[] b = new int[n-k];

        for(int i = 0; i < n-k; i++){
            b[i] = nums[i];
        }

        int count = 0;
        for(int j = n-1; count < k; j--){
            a[count] = nums[j];
            count++;
        }

        for(int i = 0; i < k; i++){
            nums[i] = a[k-1-i];
        }

        for(int i = 0; i < n-k; i++){
            nums[i+k] = b[i];
        }
    }
}
