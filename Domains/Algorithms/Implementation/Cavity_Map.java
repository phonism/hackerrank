import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Cavity_Map {

    FastIO scan = new FastIO();
    PrintWriter cout = new PrintWriter(System.out);

    public void run() {

        int n = scan.nextInt();
        int[][] num = new int[n][n];
        for (int i = 0; i < n; i++) {
            String str = scan.next();
            for (int j = 0; j < n; j++) {
                num[i][j] = str.charAt(j) - '0';
            }
        }

        int[][] result = new int[n][n];
        int[][] dir = { {0, 1}, {0, -1}, {1, 0}, {-1, 0} };
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                int x = i, y = j;
                boolean ok = false;
                for (int k = 0; k < 4; k++) {
                    x = i + dir[k][0];
                    y = j + dir[k][1];
                    if (num[i][j] <= num[x][y]) {
                        ok = true;
                        break;
                    }
                }
                if (ok == false) {
                    result[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (result[i][j] == -1) {
                    cout.print("X");
                } else {
                    cout.print(num[i][j]);
                }
            }
            cout.println();
        }
        cout.flush();

    }

    public static void main(String[] args) {
        new Cavity_Map().run();
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

