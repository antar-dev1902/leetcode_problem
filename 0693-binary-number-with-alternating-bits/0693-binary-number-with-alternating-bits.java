class Solution {
    public boolean hasAlternatingBits(int n) {
        char[] a=Integer.toBinaryString(n).toCharArray();
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                return false;
            }
        }
        return true;
    }
}