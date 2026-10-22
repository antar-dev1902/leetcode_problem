class Solution {
    public boolean checkIfExist(int[] arr) {
        List<Integer> list=new ArrayList<>();
        for(int i:arr){
            list.add(i);
        }
        for(int i=0;i<list.size();i++){
            if (list.contains(list.get(i) * 2)) {
                int index = list.indexOf(list.get(i) * 2);

                if (index != i) {
                    return true;
                }
        }
    }
        return false;
        
    }
}