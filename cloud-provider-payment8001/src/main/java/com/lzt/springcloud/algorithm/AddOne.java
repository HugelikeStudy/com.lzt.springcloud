package com.lzt.springcloud.algorithm;

import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.annotation.Transactional;

public class AddOne {
    @Transactional
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        for(int i = length-1;i >= 0;i--){
            if(digits[i] != 9){
                digits[i]+=1;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        int temp[] = new int[length + 1];
        temp[0] = 1;
        return temp;
    }

    public static void main(String[] args) {
        int[] a = {9,9,9,9,9,9,9};
        AddOne addOne = new AddOne();
        int[] res = addOne.plusOne(a);
        for(int i = 0;i < res.length;i++){
            System.out.println(res[i]);
        }
    }
}
