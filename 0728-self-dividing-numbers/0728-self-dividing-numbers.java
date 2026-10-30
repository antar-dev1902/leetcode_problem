class Solution {
    public boolean divide(int n,int m){
        if(n==0){
            return true;
        }
        if(n%10==0){
            return false;
        }
        if(m%(n%10)!=0){
            return false;
        }
        return divide(n/10,m);
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(divide(i,i)){
                list.add(i);
            }
        }
        return list;
    }
}