import java.util.Scanner;

public class Pro21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of an array : ");
		int size = scanner.nextInt();
		int[] a = new int[size];
		String s = "";
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the element " + (i + 1) + " :");
			a[i] = scanner.nextInt();
			s += a[i]+" ";
		}
		System.out.println("\nThe Entered array elements are : \n"+s);
		int count = 0;
		for (int i = 1; i < a.length; i++) {
			int z = 0;
			int sum1 = 0;
			int sum2 = 0;
			float avg1;
			float avg2;
			int[] p = new int[i];
			int[] q = new int[a.length - i];
			for (int k = 0; k < p.length; k++) {
				p[k] = a[z];
				sum1 += p[k];
				z++;
			}
			avg1 = (float) sum1 / p.length;
			for (int j = 0; j < q.length; j++) {
				q[j] = a[z];
				sum2 += q[j];
				z++;
			}
			avg2 = (float) sum2 / q.length;
			if (avg1 == avg2) {
				count++;
				System.out.println("\nPossibility : "+count);
				for (int k = 0; k < p.length; k++) {
					System.out.print(p[k] + " ");
				}
				System.out.println();
				for (int k = 0; k < q.length; k++) {
					System.out.print(q[k] + " ");
				}
			}
		}
		if(count == 0) {
			System.out.println("\nNot Possible");
		}
		scanner.close();
	}
}
