class Solution {
    public String reverseWords(String s) {
        String[] a=s.split(" ");
        String b="";
        for(int i=a.length-1;i>=0;i--){
            if(!a[i].isEmpty()){
                b+=a[i];
                if(i>0){
                    b+=" ";
                }                
            }
        }
        return b.trim();
    }
}