class Solution {
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int num=0;
        for(int i=left;i<=right;i++){
            int temp=i;
            int count=0;
            while(temp!=0){
                count+=temp&1;
                temp=temp>>1;
            }
            if(isPrime(count)){
                num++;
            }
        }
        return num;
    }
}