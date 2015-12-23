import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Cut_the_sticks {

	FastIO scan = new FastIO();
	PrintWriter cout = new PrintWriter(System.out);

	public void run() {

		int n = scan.nextInt();
		int[] a = new int[1111];
		for (int i = 0; i < n; i++) {
			int x = scan.nextInt();
			a[x]++;
		}
		System.out.println(n);
		for (int i = 1; i <= 1000; i++) {
			if (a[i] != 0 && n - a[i] != 0) {
				System.out.println(n - a[i]);
				n = n - a[i];
			}
		}

	}

	public static void main(String[] args) {
		new Cut_the_sticks().run();
	}

	public class FastIO {
		BufferedReader br;
		StringTokenizer st;
		PrintWriter out;

		public FastIO(InputStream in, OutputStream o) {
			br = new BufferedReader(new InputStreamReader(in));
			out = new PrintWriter(new OutputStreamWriter(o));
			eat("");
		}

		public FastIO() {
			br = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(new OutputStreamWriter(System.out));
			eat("");
		}

		public void eat(String s) {
			st = new StringTokenizer(s);
		}

		public String nextLine() {
			try {
				return br.readLine();
			} catch (IOException e) {
				throw new IOError(e);
			}
		}

		public boolean hasNext() {
			while (!st.hasMoreTokens()) {
				String s = nextLine();
				if (s == null)
					return false;
				eat(s);
			}
			return true;
		}

		public String next() {
			hasNext();
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public void print(String ans) {
			out.print(ans);
			out.flush();
		}

		public void println(String ans) {
			out.println(ans);
			out.flush();
		}

		public void close() {
			out.close();
		}
	}
}

