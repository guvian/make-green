import java.util.Scanner;

public class Pro52 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[8];
		System.out.println("Enter the four Co_ordinates(8 values) :");
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		for (int j = 2; j < a.length; j = j + 2) {
			if (a[0] / a[j] == 1) {
				int temp = a[2];
				int temp1 = a[3];
				a[2] = a[j];
				a[3] = a[j + 1];
				a[j] = temp;
				a[j + 1] = temp1;
			}
		}
int p = Math.abs(a[1] - a[3]);
		int q = Math.abs(a[5] - a[7]);
		int r = Math.abs(a[2] - a[4]);
		int s = Math.abs(a[0] - a[6]);
	if (p == q && p == r && p == s) {
			System.out.println("The given Co_ordinates forms a square.");
		} else {
			System.out.println("The given Co_ordinates does not forms a square.");
		}
		scanner.close();
	}
}
