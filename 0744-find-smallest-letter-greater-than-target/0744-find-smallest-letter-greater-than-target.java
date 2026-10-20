class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left=0;
        int right=letters.length-1;
        TreeSet<Character> set=new TreeSet<>();
        while(left<=right){
            int mid=(left+right)/2;
            if(letters[mid]>target){
                set.add(letters[mid]);
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        if(set.size()!=0){
            return set.pollFirst();
        }
        return letters[0];
        
    }
}