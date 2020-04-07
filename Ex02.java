package ch07_ex;

import java.util.ArrayList;
import java.util.Scanner;



public class Ex02 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		double score=0 ;
		double total=0 ;
		
		ArrayList<Character> arr = new ArrayList<Character>();

		System.out.print("6개 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");

		for (int i =0; i < 6; i++) {

			char user = scan.next().charAt(0);
			arr.add(user);
			
			
		}

		for (int i =0; i < 6; i++) {

			char grade = arr.get(i);
			System.out.println(score);
			total += score;

			switch (grade) {
			case 'A':
				score = 4.0;
				break;
			case 'B':
				score = 3.0;
				break;
			case 'C':
				score = 2.0;
				break;
			case 'D':
				score = 1.0;
				break;
			case 'F':
				score = 0.0;
				break;

			}
		}

		System.out.print(total / 6);

	}

}
