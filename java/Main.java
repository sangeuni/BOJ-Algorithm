import java.util.Scanner;

public class Main {
	/* 나머지 */
	public void go() {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	System.out.println(add(a,b,c));
	System.out.println(add(a,b,c));
	System.out.println(mul(a,b,c));
	System.out.println(mul(a,b,c));
	
	}
	
	public int add(int a, int b, int c) {
		return (a+b)%c;
	}
	public int mul(int a, int b, int c) {
		return (a*b)%c;
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.go();
	}
}