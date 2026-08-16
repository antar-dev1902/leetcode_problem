class Solution {
    public String reverseWords(String s) {
        String[] a=s.split(" ");
        for(int i=0;i<a.length;i++){
            StringBuilder sb=new StringBuilder(a[i]);
            a[i]=sb.reverse().toString();
        }
        String b="";
        for(int i=0;i<a.length;i++){
            b+=a[i];
            if(i<a.length-1){
                b+=" ";
            }
        }
        return b;
        
    }
}