class Solution {
    public int countSegments(String s) {
        if(s.equals("")){
            return 0;
        }
        String[] a=s.split(" ");
        ArrayList<String> set=new ArrayList<>();
        for(String i:a){
            if(i.equals("")){
                continue;
            }
            set.add(i);
        }

        return set.size();
        
    }
}