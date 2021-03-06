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

public class ACM_ICPC_Team {

	FastIO scan = new FastIO();
	PrintWriter cout = new PrintWriter(System.out);

	public int gao(String a, String b) {
		int res = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '1' || b.charAt(i) == '1') {
				res++;
			}
		}
		return res;
	}
	
	public void run() {

		int n = scan.nextInt();
		int m = scan.nextInt();
		String[] state = new String[n + 1];
		for (int i = 1; i <= n; i++) {
			state[i] = scan.next();
		}
		
		int MAX = 0, NUM = 0;
		
		for (int i = 1; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
				int tmp = gao(state[i], state[j]);
				if (tmp > MAX) {
					MAX = tmp;
					NUM = 1;
				} else if (tmp == MAX) {
					NUM++;
				}
			}
		}
		System.out.println(MAX + "\n" + NUM);

	}

	public static void main(String[] args) {
		new ACM_ICPC_Team().run();
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

