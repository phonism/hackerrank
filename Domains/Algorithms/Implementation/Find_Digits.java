import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Find_Digits {

	FastIO scan = new FastIO();
	PrintWriter cout = new PrintWriter(System.out);
	
	public void run() {

		int test = scan.nextInt();
		for (int cas = 1; cas <= test; cas++) {
			long n = scan.nextLong();
			long copy = n;
			int answer = 0;
			if (n == 0) {
				System.out.println("0");
				continue;
			}
			while (copy > 0) {
				long tmp = copy % 10;
				if (tmp != 0 && n % tmp == 0)
					answer++;
				copy /= 10;
			}
			System.out.println(answer);
		}

	}

	public static void main(String[] args) {
		new Find_Digits().run();
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

