class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i)>1){
                list.add(i);
            }
            sum+=i;
        }
        int n=nums.length;
        list.add(n*(n+1)/2-sum);

        int[] a=new int[list.size()];
        int k=0;
        for(int i:list){
            a[k++]=i;
        }

        return a;
        
    }
}