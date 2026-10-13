class Solution {
    public long sumAndMultiply(int n) {
        char[] a=(""+n).toCharArray();
        long sum=0;
        long num=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!='0'){
                sum+=(a[i]-'0');
                num=num*10+(a[i]-'0');
            }
        }
        return sum*num;
    }
}