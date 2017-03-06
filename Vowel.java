import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char d = s.next().charAt(0);
		Character.toUpperCase(d);
		if (d == 'A' || d == 'E' || d == 'I' || d == 'O' || d == 'U') {
			System.out.println("The given character is a vowel");
		} else {
			System.out.println("The given character is a consonant");
		}
	}
}


