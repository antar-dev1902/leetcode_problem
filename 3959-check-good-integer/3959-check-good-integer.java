class Solution {
    public boolean checkGoodInteger(int n) {
        int digi=0;
        int square=0;
        while(n!=0){
            digi+=(n%10);
            square+=(Math.pow(n%10,2));
            n=n/10;
        }
        return (square-digi)>=50;
        
    }
}