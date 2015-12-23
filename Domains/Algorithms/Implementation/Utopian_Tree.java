import java.util.Scanner;

public class Utopian_Tree {

	void run() {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();

		for (int cas = 1; cas <= test; cas++) {
			int n = scan.nextInt();
			long result = 0;
			for (int i = 0; i <= n; i++) {
				if (i % 2 == 0) {
					result++;
				} else {
					result *= 2;
				}
			}
			System.out.println(result);
		}
	}

	public static void main(String args[]) {
		new Utopian_Tree().run();
	}

}

