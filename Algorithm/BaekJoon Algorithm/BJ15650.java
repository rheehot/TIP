import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ15650 {
	static boolean[] c = new boolean[10];
	static int[] a = new int[10];

	static void go(int index, int start, int N, int M) {
		if (index == M) {
			for (int i = 0; i < M; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = start; i <= N; i++) {
			a[index] = i;
			go(index + 1, i + 1, N, M);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		int N = Integer.parseInt(tokenizer.nextToken());
		int M = Integer.parseInt(tokenizer.nextToken());

		go(0, 1, N, M);
	}
}
