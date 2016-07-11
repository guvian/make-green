import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int range = scanner.nextInt();
		int[] length = new int[range];
		String[] string = new String[range];
		for(int i=0;i<range;i++)
		{
			System.out.println("Enter the string "+(i+1)+" :");
			string[i] = scanner.next();
			length[i] = string[i].length();
		}
		System.out.println("Enter any number(length) to display the number of strings with the entered length : ");
		int number = scanner.nextInt();
		int count=0;
		for(int i=0;i<range;i++)
		{
			if(number == length[i]) {
				count++;
			}
		}
		System.out.println("The number of string with the entered length is : "+count);
		scanner.close();
		}
	}
