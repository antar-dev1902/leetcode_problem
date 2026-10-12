class Solution {
    long rev(int n,long m){
        if(n==0){
            return m;
        }
        m=m*10+n%10;
        return rev(n/10,m);
    }
    public int reverse(int x) {
        long y=0;
        if(x<0){
            x=Math.abs(x);
            y=(-1)*rev(x,y);

        }else{
            y=rev(x,y);
        }
        if(y>Integer.MAX_VALUE || y<Integer.MIN_VALUE){
            return 0;
        }
        return (int)y;
        
    }
}