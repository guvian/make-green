import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input : ");
		String input = s.nextLine();
		s.close();
		String[] a = input.split(" ");
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = Integer.parseInt(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			int z = 1;
			if (b[i] == 1) {
				System.out.print("True  ");
			} else {
				while (z <= b[i]) {
					z = z * 2;
				}
				z = z / 2;
				if (z == b[i]) {
					System.out.print("True  ");
				} else {
					System.out.print("False  ");
				}
			}
		}
	}
}
