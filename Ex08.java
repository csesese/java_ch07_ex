package ch07_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex08 {

	static Scanner scan= new Scanner(System.in);
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String,Integer>(); 
		System.out.println("**포인트 관리 프로그램입니다**");

		while (true) {
			System.out.print("이름과 포인트 입력>>");
			String name = scan.next();
			Integer point = scan.nextInt();

			Integer p = hm.get(name);

			if (p != null) {
				point += p;
			}
			hm.put(name, point);
			
			if (name.equals("그만"))
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
