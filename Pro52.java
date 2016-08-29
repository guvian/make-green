import java.util.Scanner;

public class Pro52 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[8];
		System.out.println("Enter the four points(8 values) :");
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		double r = Math.sqrt(((a[6] - a[4]) * (a[6] - a[4])) + ((a[7] - a[5]) * (a[7] - a[5])));
		double p = Math.sqrt(((a[2] - a[0]) * (a[2] - a[0])) + ((a[3] - a[1]) * (a[3] - a[1])));
		double q = Math.sqrt(((a[4] - a[2]) * (a[4] - a[2])) + ((a[3] - a[1]) * (a[3] - a[1])));
		if (p == q && q == r) {
			System.out.println("The given four points forms a square.");
		} else {
			System.out.println("The given four points does not forms a square.");
		}
		scanner.close();
	}
}
