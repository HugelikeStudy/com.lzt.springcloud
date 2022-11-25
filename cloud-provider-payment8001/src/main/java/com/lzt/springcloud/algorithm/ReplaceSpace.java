package com.lzt.springcloud.algorithm;

public class ReplaceSpace {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        String s = "We are family！";
        System.out.println(replace(s));
    }

    public static String replace(String s){
        char[] ch = s.toCharArray();
        int length = s.length();
        for(Character c : ch){
            if(c == ' '){
                length+=2;
            }
        }
        char[] chars = new char[length];
        for(int i = 0,j = 0;i<length;){
            if(chars[length-1] != 0){
                break;
            }
            if(s.charAt(i) != ' '){
                chars[j++] = s.charAt(i++);
            }else{
                chars[j++] = '%';
                chars[j++] = '2';
                chars[j++] = '0';
                i++;
            }
        }
        return chars.toString();
    }

}
