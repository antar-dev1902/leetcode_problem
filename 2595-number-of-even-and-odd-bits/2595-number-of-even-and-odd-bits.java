class Solution {
    public int[] evenOddBit(int n) {
        int even=0;
        int odd=0;
        StringBuilder s=new StringBuilder(Integer.toBinaryString(n)).reverse();
        char[] a=s.toString().toCharArray();
        for(int i=0;i<a.length;i++){
            if(i%2==0 && a[i]=='1'){
                even++;
            }else if(i%2!=0 && a[i]=='1'){
                odd++;
            }
        }

        int[] arr=new int[2];
        arr[0]=even;
        arr[1]=odd;

        return arr;
    }
}