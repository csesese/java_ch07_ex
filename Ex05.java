package ch07_ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student {
	String name;
	String major;
	int id;
	double score;

	public Student(String n, String m, int i, double s) {
		this.name = n;
		this.major = m;
		this.id = i;
		this.score = s;

	}

	public String getName() {
		return name;
	}

	public String getMajor() {
		return major;
	}

	public int getId() {
		return id;
	}

	public double getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "�̸�:" + name + "\n" + "�а�:" + major + "\n" + "�й�:" + id + "\n" + "�������:" + score;
	}

}

public class Ex05 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Student> a = new ArrayList<>();
		System.out.println("�л� �̸�, �а�, �й�,������� �Է��ϼ��� .");

		for (int i = 0; i < 4; i++) {
			System.out.print(">>");
			String name = scan.next();
			String major = scan.next();
			int id = scan.nextInt();
			double score = scan.nextDouble();

			a.add(new Student(name, major, id, score));
		}
		
		Iterator<Student> it = a.iterator();
		while(it.hasNext()){
			Student student = it.next();
			
			System.out.println(student);
			System.out.println("-------------------");
		}
		
		while(true){
			System.out.print("�л� �̸�>>");
			String stname=scan.next();
			
			if(stname.equals("�׸�")) break;
			
			for(int i=0; i<a.size();i++){
				Student s=a.get(i);
				
			
				if(stname.equals(s.getName())){
					System.out.println(s);
				}
				
			}
			
		}
		
			
		
		
		
		}

	}


