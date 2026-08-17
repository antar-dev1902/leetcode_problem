class Solution {
    public boolean detectCapitalUse(String word) {

        if(Character.isUpperCase(word.charAt(0))){
            int flag=0;
            for(int i=1;i<word.length();i++){
                if(Character.isUpperCase(word.charAt(i))){
                    continue;
                }else{
                    flag++;
                }
            }
            if(flag==0){
                return true;
            }
            else if(flag+1==word.length()){
                return true;
            }else{
                return false;
            }

        }else{
            for(int i=0;i<word.length();i++){
                if(Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
            return true;
        }
}}