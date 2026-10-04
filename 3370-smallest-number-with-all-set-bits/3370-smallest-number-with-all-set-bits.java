class Solution {
    public int smallestNumber(int n) {
        int len=Integer.toBinaryString(n).length();
        while(n!=0){
            int temp=n;
            int count=0;
            while(temp!=0){
                count+=temp&1;
                temp=temp>>1;
            }
            if(count==len){
                return n;
            }
            n++;
        }
        return 0;
    }
}