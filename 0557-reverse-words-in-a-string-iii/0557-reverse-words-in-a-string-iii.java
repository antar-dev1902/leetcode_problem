class Solution {
    public String reverseWords(String s) {
        String[] a=s.split(" ");
        StringBuilder b=new StringBuilder();        
        for(int i=0;i<a.length;i++){
            StringBuilder sb=new StringBuilder(a[i]);
            a[i]=sb.reverse().toString();
            b.append(a[i]);
            if(i<a.length-1){
                b.append(" ");
            }
        }
        
        
        return b.toString();
        
    }
}