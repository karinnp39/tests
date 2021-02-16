import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Exp1 {
	static int n1 = 1, n2 = 1, n3 = 0;

	static void Fibonacci(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			Fibonacci(count - 1);
		} else {
			System.out.print(n3);
		}
	}

	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		int count = myObj.nextInt();
		if (count < 3)
			System.out.print(1);
		else
			Fibonacci(count - 2);
	}
}
