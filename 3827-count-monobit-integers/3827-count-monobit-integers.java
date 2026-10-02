class Solution {
    static boolean count(String s){
        HashSet<Character> set=new HashSet<>();
        for(char a:s.toCharArray()){
            set.add(a);
        }
        return set.size()==1;
    }
    public int countMonobit(int n) {
        int num=0;
        for(int i=0;i<=n;i++){
            String a=Integer.toBinaryString(i);
            if(count(a)){
                num++;
            }
            
        }
        return num;
    }
}