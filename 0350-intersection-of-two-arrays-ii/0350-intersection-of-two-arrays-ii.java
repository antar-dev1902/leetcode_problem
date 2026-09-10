class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> set=new HashMap<>();
        

        for(int i=0;i<nums1.length;i++){
            set.put(nums1[i],set.getOrDefault(nums1[i],0)+1);
        }
        List<Integer> list=new ArrayList<>();

        for(int i:nums2){
            if(set.containsKey(i) && set.get(i)>0){
                list.add(i);
                set.put(i,set.get(i)-1);
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}