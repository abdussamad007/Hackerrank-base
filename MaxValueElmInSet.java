package com.abdus.algo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MaxValueElmInSet {
public static void main(String[] args) {
	
	Set<Integer> mySet = new HashSet<Integer>();
	mySet.add(5);
	mySet.add(12);
	mySet.add(7);
	mySet.add(21);
	mySet.add(13);
	mySet.add(11);
	
	Integer max = Collections.max(mySet);
	System.out.println(max);
	
}
}
