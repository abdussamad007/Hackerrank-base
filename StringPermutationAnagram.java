package com.abdus.algo;

//https://www.youtube.com/watch?v=TnZHaH9i6-0
public class StringPermutationAnagram {
	
	public static void main(String[] args) {
		String str = "ABCD";
		StringPermutationAnagram obj = new StringPermutationAnagram();
		obj.calculate(str, 0, str.length()-1);
	}

	private void calculate(String str , int startIndex,int endIndex) {
		if(startIndex == endIndex) {
			System.out.println(str);
		}else {
			//int len = str.length();
			for(int i=startIndex;i<=endIndex;i++) {
				String swapedChar = swapChars(str, startIndex,i);
				calculate(swapedChar, startIndex+1, endIndex);
			}
		}
		
	}
	
	private String swapChars(String input, int startIndex, int endIndex) {
		
		char[] inputChar = input.toCharArray();
		
		char temp;
		char ch=inputChar[startIndex];
		inputChar[startIndex] = inputChar[endIndex];
		inputChar[endIndex] = ch;
		
		return String.valueOf(inputChar);
		
	}
}
