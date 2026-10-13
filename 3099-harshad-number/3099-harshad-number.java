class Solution {
    public int unit(int n){
        if(n==0){
            return 0;
        }
        return n%10+unit(n/10);
    }
    public int sumOfTheDigitsOfHarshadNumber(int x) {

        int y=unit(x);
        if(x%y==0){
            return y;
        }
        return -1;
    }
}