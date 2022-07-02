package com.chainsys.springproject.demo;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value ");
		int value = s.nextInt();
		int count1 = value, space1 = value + 2, space2 = value + 2;
		for (int i = 1; i <= 3; i++) {
			for (int a = 1; a <= space2; a++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= count1; j++) {
				System.out.print("*");
			}
			for (int k = 1; k <= space1; k++) {
				System.out.print(" ");
			}
			for (int m = 1; m <= count1; m++) {
				System.out.print("*");
			}
			count1 = count1 + 2;
			space1 = space1 - 2;
			space2--;
			System.out.println();
		}
		space1 = space1 + 2;
		count1 = space1 - 2;
		int star = count1 * 2 + space1, starcount = star;
		space2 = value;
		while (starcount > 0) {
			for (int j = 1; j <= space2; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= starcount; k++) {
				System.out.print("*");
			}
			starcount = starcount - 2;
			if (starcount == 2)
				starcount = starcount + 1;
			space2++;
			System.out.println();

		}
	}

}
