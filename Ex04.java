package ch07_ex;

import java.util.Scanner;
import java.util.Vector;



public class Ex04 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int total=0;
		Vector<Integer> v = new Vector<Integer>();
		
		while(true){
			System.out.print("강수량 입력 (0입력시 종료)>>");
			Integer rain = scan.nextInt();
			
			if(rain.equals(0)) break;
			
			v.add(rain);
			
			for(int i=0 ; i<v.size(); i++){
				System.out.print(v.get(i)+" ");
				total+=v.get(i);		
			}
			
			
			
			System.out.println();
		
			System.out.println("현재 평균 : "+ total/v.size());
			total=0;
		}
		
		
		
	}

}
