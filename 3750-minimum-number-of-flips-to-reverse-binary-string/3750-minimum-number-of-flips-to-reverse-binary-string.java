class Solution {
    public int minimumFlips(int n) {
        StringBuilder a=new StringBuilder(Integer.toBinaryString(n));
        String rev=new StringBuilder(a).reverse().toString();
        if(a.toString().equals(rev)){
            return 0;
        }
        int b=Integer.parseInt(rev,2);
        int ans=n^b;
        int count=0;
        for(int i=0;i<31;i++){
            if((ans & (1<<i))!=0){
                count++;
            }
        }
        return count;
    }
}