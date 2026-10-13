class Solution {
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public int gcdOfOddEvenSums(int n) {
        int count=0;
        int even=0;
        int odd=0;
        for(int i=1;count<2*n;i++){
            if(i%2==0){
                even+=i;
            }else{
                odd+=i;
            }

            count++;
        }
        
        return gcd(odd,even);
        
    }
}