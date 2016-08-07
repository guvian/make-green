import java.util.Scanner;

public class BalancedWord {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String :");
		String input = s.nextLine();
		String[] a = input.split(" ");
		char last1 = 'n';
		char last2 = 'z';
		char first1 = 'a';
		char first2 = 'm';
		String[] b = new String[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i].toLowerCase();
		}
		int[] count = new int[b.length];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length() - 2; j++) {
				char c = b[i].charAt(j);
				char e = b[i].charAt(j+1);
				char d = b[i].charAt(j + 2);
				if ((c >= last1 && c <= last2) && (d >= last1 && d <= last2) && (e >= first1 && e <= first2)) {
					count[i] = 1;
				} else if ((c >= first1 && c <= first2) && (d >= first1 && d <= first2) && (e >= last1 && e <= last2)) {
					count[i] = 2;
				} else {
					count[i] = 3;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (count[i] == 1 || count[i] == 2) {
				System.out.println(a[i] + " is balanced");
			} else {
				System.out.println(a[i] + " is not balanced");
			}
		}
		s.close();
	}
}
