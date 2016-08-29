import java.util.Scanner;

public class Pro33 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = scanner.next();
		int count = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) < s.charAt(i + 1)) {
				System.out.println(s.substring(i));
				count = 1;
				break;
			}
		}
		if (count == 0) {
			System.out.println("No such Strings Found!");
		}
		scanner.close();
	}
}
