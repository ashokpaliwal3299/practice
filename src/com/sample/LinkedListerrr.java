package com.sample;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListerrr {

	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();

		li.add(5);
		li.add(5);
		li.add(6);

		System.out.println("linklist is " + li);

		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);

		System.out.println("arraylist is " + al);
	}

}
