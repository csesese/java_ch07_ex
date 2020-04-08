package ch07_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Location {

	int udo;
	int gdo;

	public Location() {
	}

	public Location(int udo, int gdo) {
		this.udo = udo;
		this.gdo = gdo;
	}

	public int getUdo() {
		return udo;
	}

	public int getGdo() {
		return gdo;
	}

	@Override
	public String toString() {
		return "  " + udo + " " + gdo;
	}

}

public class Ex06 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		HashMap<String, Location> h = new HashMap<>();

		System.out.println("���� , �浵 , ������ �Է��ϼ���");
		for (int i = 0; i < 4; i++) {
			System.out.print(">>");
			String city = scan.next();
			int udo = scan.nextInt();
			int gdo = scan.nextInt();

			h.put(city, new Location(udo, gdo));
		}
		System.out.println("===============================");

		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String name = it.next();
			Location lo = h.get(name);
			System.out.println(name + " " + lo);

		}
		System.out.println("===============================");
		while (true) {

			System.out.print("�����̸�>>");
			String searchcity = scan.next();
			if (searchcity.equals("�׸�"))
				break;

			Location l = h.get(searchcity);
			if (l == null) {
				System.out.println(searchcity + "�� �����ϴ�.");
			} else
				System.out.println(searchcity + " " + l);
		}

	}

}
