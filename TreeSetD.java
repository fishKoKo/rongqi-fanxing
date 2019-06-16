package rongqi_fanxing;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetD {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
			
			public int compare(Student s1, Student s2) {

				int num = s2.getSum() - s1.getSum();
				int num1 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
				return num1;
			}
		});
		
		Scanner n = new Scanner(System.in);
		System.out.println("����ѧ���ĸ�����");
		String n1 = n.nextLine();
		
		for(int x = 1; x <= Integer.parseInt(n1); x++){
			Scanner sc = new Scanner(System.in);
			System.out.println("�����" + x + "��ѧ����ѧ�ţ�");
			String num = sc.nextLine();
			System.out.println("�����" + x + "��ѧ����������");
			String name = sc.nextLine();
			System.out.println("�����" + x + "��ѧ�����۲⣺");
			String point = sc.nextLine();

			Student s = new Student(num, name, Integer.parseInt(point));

			ts.add(s);
		}
		System.out.println("ѧ����Ϣ¼����ϣ�");

		System.out.println("ѧ����Ϣ�����۲�Ӹߵ����������£�");
		for(Student s : ts){
			System.out.println(s.getNum() + "\t" + s.getName() + "\t" + s.getSum());
		}
	}
}


