package com.abdus.algo;

//https://leetcode.com/problems/reverse-string/
public class ReverseString {
public static void main(String[] args) {
  String[] strArr = {"h","e","l","l","o"};	
   //String[] strArr = {"H","a","n","n","a","h"};  
    if(strArr != null && strArr.length > 1) {
    	if(strArr.length %2 == 0) {
    		int halfLen = strArr.length/2;
    		int len = strArr.length;
    		String temp ="";
    		for(int i=0;i<halfLen;i++) {
    			temp = strArr[i];
    			strArr[i] = strArr[len-1-i];
    			strArr[len-1-i] = temp;
    		}
    		
    		for (String s : strArr) {
				System.out.print(s + " ");
			}
    		
    	}else {

    		int halfLen = (strArr.length-1)/2;
    		int len = strArr.length;
    		String temp ="";
    		for(int i=0;i<halfLen;i++) {
    			temp = strArr[i];
    			strArr[i] = strArr[len-1-i];
    			strArr[len-1-i] = temp;
    		}
    		
    		for (String s : strArr) {
				System.out.print(s + " ");
			}
    		
    	
    	}
    }
   
   
}
}
