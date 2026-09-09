class Solution {
    public boolean checkRecord(String s) {
        char[] b=s.toCharArray();
        int a=0;
        int l=0;
        for(int i=0;i<b.length;i++){
            if(b[i]=='A'){
                a++;
            }
        }
        for(int i=0;i<b.length-2;i++){
            if(b[i]=='L' && b[i+1]=='L' && b[i+2]=='L'){
                l=1;
                break;
            }
        }
        if(a>=2 || l==1){
            return false;
        }else{
            return true;
        }
    }
}