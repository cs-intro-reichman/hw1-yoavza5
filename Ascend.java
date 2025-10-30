// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		String Slim = args[0];
		int lim = Integer.parseInt(Slim);
		int a = (int)(Math.random() * lim);
		int b = (int)(Math.random() * lim);
		int c = (int)(Math.random() * lim);
		System.out.println(a + "  " + b + "  " + c);
		System.out.print(Math.min(a, Math.min(b, c)) + "  ");
		System.out.print(a + b + c - Math.max(a, Math.max(b, c)) - Math.min(a, Math.min(b, c)) + "  ");
		System.out.print(Math.max(a, Math.max(b, c)));
	}
}
