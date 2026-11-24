class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> l1=new ArrayList<>();

            l1.add(1);
            for(int j=1;j<i;j++){
                int x=list.get(i-1).get(j-1)+list.get(i-1).get(j);
                l1.add(x);
            }
            if(i>0){
                l1.add(1);
            }
            list.add(l1);

        }
        return list;
        
    }
}