package ch07_ex;

import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nation;

		HashMap<String, Integer> nations = new HashMap<String, Integer>();

		System.out.println("���� �̸��� �α��� �Է��ϼ���.");
		while (true) {
			System.out.print("���� �̸�, �α� >>");
			nation = scan.next();

			if (nation.equals("�׸�"))
				break;

			Integer people = scan.nextInt();
			nations.put(nation, people);

		}

		while (true) {
			System.out.print("�α� �˻�>>");
			String n = scan.next();
			Integer p = nations.get(n);

			if (n.equals("�׸�"))
				break;

			if (p == null) {
				System.out.println(n + "����� �����ϴ�.");
			} else {
				System.out.println(n + "�� �α��� " + p);

			}

		}
		scan.close();

	}

}
