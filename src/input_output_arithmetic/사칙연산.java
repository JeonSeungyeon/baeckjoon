package input_output_arithmetic;

import java.util.Scanner;

public class 사칙연산 {

	public static void main(String[] args) {
		int A;
		int B;
		
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);

	}

}
