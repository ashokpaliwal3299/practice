package com.sample;

import java.util.Arrays;
import java.util.List;

public class StreamApiExample {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,5,6,7,8);
		
		System.out.println(nums.stream().count());
		
		nums.stream().forEach(num -> System.out.println(num));
	}
}
