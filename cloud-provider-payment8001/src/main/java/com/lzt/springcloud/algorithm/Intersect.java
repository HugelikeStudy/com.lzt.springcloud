package com.lzt.springcloud.algorithm;

import java.util.Arrays;
import java.util.LinkedList;

public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        LinkedList<Integer> list = new LinkedList<>();
        int i = 0,j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] res = new int[list.size()];
        for(int k = 0;k<res.length;k++){
            res[k] = list.get(k);
        }
        return res;
    }

    public static void main(String[] args) {
        Intersect intersect = new Intersect();
        int[] a = {4,9,5};
        int[] b = {9,4,9,8,4};
        int[] c = intersect.intersect(a,b);
        for(Integer i : c){
            System.out.println(i);
        }
    }
}
