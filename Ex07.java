package ch07_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class Ex07 {

	String name;
	double score;
	
	static Scanner scan = new Scanner(System.in); 
	public static void main(String[] args) {
		HashMap<String, Double> map = new HashMap<String, Double>();
		
		for(int i=0; i<5; i++){
			System.out.print("�̸��� ����>>");
			map.put(scan.next(), scan.nextDouble());
			
		}
		System.out.print("���л� ���� ���� ���� �Է�>>");
		double best = scan.nextDouble();
		
		System.out.print("���л� ���: ");
		
		Set<String>keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String key= it.next();
			Double value=map.get(key);
			
		
			
			if(value>=best){
			
				System.out.print(key+" ");
			}
			
		}
		}

}
