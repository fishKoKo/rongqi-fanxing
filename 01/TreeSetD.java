package rongqi_fanxing;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetD {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
			
			public int compare(Student s1, Student s2) {

				int num = s2.getSum() - s1.getSum();
				int num1 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
				return num1;
			}
		});
		
		Scanner n = new Scanner(System.in);
		System.out.println("输入学生的个数：");
		String n1 = n.nextLine();
		
		for(int x = 1; x <= Integer.parseInt(n1); x++){
			Scanner sc = new Scanner(System.in);
			System.out.println("输入第" + x + "个学生的学号：");
			String num = sc.nextLine();
			System.out.println("输入第" + x + "个学生的姓名：");
			String name = sc.nextLine();
			System.out.println("输入第" + x + "个学生的综测：");
			String point = sc.nextLine();

			Student s = new Student(num, name, Integer.parseInt(point));

			ts.add(s);
		}
		System.out.println("学生信息录入完毕！");

		System.out.println("学生信息按照综测从高到底排序如下：");
		for(Student s : ts){
			System.out.println(s.getNum() + "\t" + s.getName() + "\t" + s.getSum());
		}
	}
}


