import java.util.Scanner;
public class One {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array : ");
		int range = scanner.nextInt();
		int[] number = new int[range];
		for (int i = 0; i < range; i++) {
			System.out.println("Enter the " + (i + 1) + " th element : ");
			number[i] = scanner.nextInt();
			}
		int max = number[0];
		int min = number[0];
		for (int i = 0; i <number.length; i++) {
			if (number[i] > max) {
				max = number[i];
			}
			else if (number[i] < min) {
				min = number[i];
			}
		}
		System.out.println( "Max : "+max+"\nMin :" + min);
		System.out.println( "\nThe sum of maximum and minimum is :" +(max+min));
		scanner.close();
		}
	}
