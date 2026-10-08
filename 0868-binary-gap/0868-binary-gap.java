class Solution {
    public int binaryGap(int n) {
        char[] a=Integer.toBinaryString(n).toCharArray();
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]=='1'){
                for(int j=i+1;j<a.length;j++){
                    if(a[j]=='1'){
                        max=Math.max(max,j-i);
                        break;   
                    }
                }
            }
        }
        return max;
       
    }
}