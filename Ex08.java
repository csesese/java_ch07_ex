package ch07_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex08 {

	static Scanner scan= new Scanner(System.in);
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String,Integer>(); 
		System.out.println("**����Ʈ ���� ���α׷��Դϴ�**");

		while (true) {
			System.out.print("�̸��� ����Ʈ �Է�>>");
			String name = scan.next();
			Integer point = scan.nextInt();

			Integer p = hm.get(name);

			if (p != null) {
				point += p;
			}
			hm.put(name, point);
			
			if (name.equals("�׸�"))
				break;

			Set<String> keys = hm.keySet();
			Iterator<String> it = keys.iterator();
			while (it.hasNext()) {
				String key = it.next();
				Integer value = hm.get(key);
				
				
				System.out.print("(" + key + "," + value + ")");
			}
			System.out.println();
		}
		
	}

}
