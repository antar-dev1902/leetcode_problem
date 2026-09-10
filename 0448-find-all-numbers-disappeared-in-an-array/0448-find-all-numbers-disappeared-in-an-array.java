class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer> set=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            set.put(nums[i],set.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!set.containsKey(i)){
                list.add(i);
            }
        }
        return list;
    }
}