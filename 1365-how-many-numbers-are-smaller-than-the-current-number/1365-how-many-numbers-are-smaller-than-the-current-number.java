class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for (int i : nums) {
            int count = 0;

            for (int j : nums) {
                if (j < i) {
                    count++;
                }
            }
            map.put(i,count);
        }    
        int[] num=new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            num[i] = map.get(nums[i]);
        }
        return num;
    }
}