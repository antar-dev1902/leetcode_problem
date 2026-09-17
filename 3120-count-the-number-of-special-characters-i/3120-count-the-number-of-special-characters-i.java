class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set=new HashSet<>();
        for(char i:word.toCharArray()){
            set.add(i);
        }
        List<Character> list=new ArrayList<>();
        for(char c:set){
            if(Character.isUpperCase(c)){
                list.add(Character.toLowerCase(c));
            }
        }
        int count=0;
        for(char c:set){
            if(list.contains(c)){
                count++;
            }
        }
        return count;
    }
}