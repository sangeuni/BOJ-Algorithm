import java.util.Scanner;

public class Main {
	public void go() {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int[] arr;

		while (tc-- > 0) {
			int n = sc.nextInt();

			arr = new int[n];
			long sum = 0;

			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();

			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++)
					sum += gcd(arr[i], arr[j]);
			}
			System.out.println(sum);
		}
	}

	public int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.go();
	}
}