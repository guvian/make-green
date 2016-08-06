import java.util.Scanner;
public class Number {
	public int display() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string 1 :");
		String input1 = s.next();
		System.out.println("Enter the string 2 :");
		String input2 = s.next();
		s.close();
		int i = 0;
		if (input1.contains(input2)) {
			i = input1.indexOf(input2);
			System.out.println(i);
			return i;

		} else {
			System.out.println("1");
			return 1;
		}
	}

	public static void main(String[] args) {
		Number n = new Number();
		n.display();
	}
}

        
