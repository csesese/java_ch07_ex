package ch07_ex;

import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nation;

		HashMap<String, Integer> nations = new HashMap<String, Integer>();

		System.out.println("나라 이름과 인구를 입력하세요.");
		while (true) {
			System.out.print("나라 이름, 인구 >>");
			nation = scan.next();

			if (nation.equals("그만"))
				break;

			Integer people = scan.nextInt();
			nations.put(nation, people);

		}

		while (true) {
			System.out.print("인구 검색>>");
			String n = scan.next();
			Integer p = nations.get(n);

			if (n.equals("그만"))
				break;

			if (p == null) {
				System.out.println(n + "나라는 없습니다.");
			} else {
				System.out.println(n + "의 인구는 " + p);

			}

		}
		scan.close();

	}

}
