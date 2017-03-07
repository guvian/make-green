public class SumPower {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		int[] b = new int[a.length()];
		int[] c = new int[a.length()];
		int r = 0;
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			b[i] = Integer.parseInt(ch + "");
			c[i] = (int) Math.pow(b[i], i);
			r += c[i];
		}
		System.out.println(r);
	}
}
