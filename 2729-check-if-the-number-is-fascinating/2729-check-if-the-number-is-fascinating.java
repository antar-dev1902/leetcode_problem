class Solution {
    public boolean isFascinating(int n) {
        int x=2*n;
        int y=3*n;
        String s=""+n+""+x+""+y;
        if(s.length()==9){
            for(int i=1;i<10;i++){
                if(!s.contains(""+i)){
                    return false;
                }
            }
            return true;
        }
        return false;    
    }
}