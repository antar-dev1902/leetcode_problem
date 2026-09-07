class Solution {
    public String convertToBase7(int num) {
        if(num<0){
            num =Math.abs(num);
            StringBuilder a=new StringBuilder();
            while(num>0){
                int b=num%7;
                a.append(b);
                num=num/7;
            }
            a.append("-");
            return a.reverse().toString();
        }else if(num==0){
            return "0";
        }
        else{
            StringBuilder a=new StringBuilder();
            while(num>0){
                int b=num%7;
                a.append(b);
                num=num/7;
            }
            return a.reverse().toString();
        }
        
    }
}