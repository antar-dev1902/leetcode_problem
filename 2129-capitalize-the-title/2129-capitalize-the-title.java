class Solution {
    public String capitalizeTitle(String title) {
        String[] a=title.split(" ");
        for(int i=0;i<a.length;i++){
            a[i]=a[i].toLowerCase();
            if(a[i].length()>2){
                a[i]=Character.toUpperCase(a[i].charAt(0))+a[i].substring(1);

            }

        }
        String result = String.join(" ", a);
        return result;
    }
}