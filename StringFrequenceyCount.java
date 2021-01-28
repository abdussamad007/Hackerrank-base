package com.abdus.algo;

public class StringFrequenceyCount {
	
	public static void main(String[] args) {
		String str = "ddaaa";
		str = str.substring(0, 4+1);
		System.out.println("Sub String " + str);
		countFrequency(str);
	}
	
	public static void countFrequency(String input) {
		//Case 1 - all String are lowercase 
		int[] frequencyCount = new int[26];
		if(input != null || input.length()> 0) {
			input = input.toLowerCase();// as all strings are lowercase
			int len = input.length();
			for(int i=0;i<len;i++) {
				frequencyCount[input.charAt(i)-'a']++;
			}
		}
		
		for (int i : frequencyCount) {
			System.out.println(i);
			
		}
		
		/*
		 * int max = -1; // find the max frequency. char ch = 'a'; int index = 0;
		 * for(int j=0;j< 26;j++) { if(max < frequencyCount[j]) { max =
		 * frequencyCount[j]; index = j; }
		 * 
		 * 
		 * }
		 * 
		 * ch = (char)('a' + index);
		 * 
		 * System.out.println(ch + "-" + max);
		 */	
		int maxCharIndex = 0;
		
		for(int k=0;k<26;k++) {
			if(frequencyCount[k] != 0) {
				maxCharIndex = k;
			}
		}
		
		System.out.println("Max char is :" + (char)('a'+maxCharIndex) + " with frequency" + frequencyCount[maxCharIndex]);
		
		
	}

}
