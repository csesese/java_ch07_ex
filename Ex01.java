package ch07_ex;

import java.util.Scanner;
import java.util.Vector;

public class Ex01 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int max = 0;
		Vector<Integer> v = new Vector<Integer>();

		int user = 0;
		System.out.print("정수 (-1이 입력 될때 까지 )>>");

		while (!(user == -1)) {
			user = scan.nextInt();
			v.add(user);

		}

		for (int i = 0; i < v.size(); i++) {
			int n = v.get(i);
			if (n > max) {
				max = n;
			}
		}
		System.out.println("가장 큰수는" + max);
	}

}
