package com.java.Array;
public class CountAndSay{
    private static String getNext(String str){
        char last = ' ';
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length();i++){
            System.out.println(" BEFORE :: i "+i+", last : ["+last+"], str.charAt(i) :: "+str.charAt(i)+", count : "+ count);
            if(last!=str.charAt(i)){
                if(count>0){
                    sb.append(count+""+last);
                    count=1;
                }
                    last = str.charAt(i);
                    count = 1;
            }else{
                count++;
            }
            System.out.println(" AFTER :: i "+i+", last : ["+last+"], str.charAt(i) :: "+str.charAt(i)+", count : "+ count);
        }
        return sb.append(count).append(str.charAt(str.length()-1)).toString();
    }
    public static void main(String[] args) {
        System.out.println(getNext("11123566"));
    }
}