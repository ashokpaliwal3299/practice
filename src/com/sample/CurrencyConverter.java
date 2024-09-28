package com.sample;

import java.util.*;

public class CurrencyConverter {

	static int inr = 80;

	public void usdToInr(int usd, int inr) {
		int convInr1 = usd * inr;
		System.out.println(convInr1);
	}

	public void yuanToInr(int yuan, int inr) {
		int convInar2 = yuan * inr;
		System.out.println(convInar2);
	}

	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the USD");
		int usd = myObj.nextInt();

		System.out.println("Enter the YUAN");
		int yuan = myObj.nextInt();

		System.out.println("Enter your oprention: ");
		String opretion = myObj.next(); //USD
		

		CurrencyConverter c1 = new CurrencyConverter();
		if (opretion.equals("USD")) {
			c1.usdToInr(usd, inr);
		} else if (opretion.equals("YUAN")) {
			c1.yuanToInr(yuan, inr);
		} else {
			System.out.println("invalid");
		}

	}
}
