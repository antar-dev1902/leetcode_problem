class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int sum=0;
        int pro=1;
        while(n!=0){
            sum+=(n%10);
            pro*=(n%10);
            n=n/10;
        }

        return temp%(sum+pro)==0;
        
    }
}