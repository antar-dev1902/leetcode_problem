class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> map=new TreeMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        List<String> list=new ArrayList<>();
        for(int i:map.keySet()){
            list.add(map.get(i));
        }
        Collections.reverse(list);
        String[] arr=new String[list.size()];
        int j=0;
        for(String i:list){
            arr[j]=i;
            j++;
        }
        return arr;
        
    }
}