package guvi.pro;

import java.util.Scanner;

public class Pangram {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String to check for Pangram : ");
		String input1 = s.nextLine();
		String input = input1.toLowerCase();
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isAlphabetic(input.charAt(i))) {
				count++;
			}
		}
		int j = 0;
		char a[] = new char[input.length() - count];
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isLowerCase(c)) {
				a[j] = c;
				j++;
			}
		}
		int z = 0;
		String b = "";
		for (int i = 0; i < a.length - 1; i++) {
			b += a[i];
			if (b.contains("" + a[i + 1])) {
				z++;
			}
		}
		int ans = a.length - z;
		if (ans == 26) {
			System.out.println(input1 + " is a pangram");
		} else {
			System.out.println(input1 + " is not a pangram");
		}
		s.close();
	}
}
