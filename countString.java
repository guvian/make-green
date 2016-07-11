import java.util.Scanner;
class One {
  public static void main(String [] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the string : ");
    String string = scanner.nextLine();
    int length = string.length();
    int count=0;
    for(int i=0;i<length;i++) {
      char c = string.charAt(i);
      if(c == ' ') {
        count++;
      }
    }
    System.out.println("The number of words in the string is :" +(count+1));
    scanner.close();
  }
}
