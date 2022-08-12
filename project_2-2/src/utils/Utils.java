package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

import employee.DepartmentEnum;
import employee.PositionEnum;

public class Utils {
	static public int checkInputInteger(Scanner s, String msg) {
		int n=0;
		boolean valid; // ��ȿ�� �� �Է� Ȯ��
		do {
			valid = true;
			System.out.print(msg);

			try {
				n = s.nextInt(); // ���� �Է�
			}
			catch(InputMismatchException e) { // ���� �Է� Ȯ��
				System.out.println("���� �Է��ϼ���.");
				s.next(); // �Է� ��Ʈ���� �ִ� ������ �ƴ� ��ū�� ������.
				valid = false;
			}
		} while(!valid);
		
		return n;
	}
	
	public static int getID(Scanner s) {
		int id = Utils.checkInputInteger(s, ">> id: ");

		return id;
	}
	
	public static String getName(Scanner s) {
		String name=null;

		// �ڵ� �ۼ�
		System.out.print(">> name: ");
		name = s.next();
		return name;
	}

	public static DepartmentEnum getDepartment(Scanner s) {
		int dept;
		DepartmentEnum department = null;
		while(true) {
			System.out.print("== �μ� ���: ");
			for(DepartmentEnum d : DepartmentEnum.values()) {
				System.out.print(d.getMessage() + "(" + d.getCode() + ") ");
			}
			System.out.println("");
			dept = Utils.checkInputInteger(s, ">> department: ");
			
			// ��ȿ�� �� �Է� Ȯ��
			boolean valid = false;
			for(DepartmentEnum d : DepartmentEnum.values()) {
				if(dept == d.getCode()) {
					valid = true;
					department = d;
					break;
				}
			}

			if(valid) {
				break;
			}
		}
		
		return department;
	}
	
	public static PositionEnum getPosition(Scanner s) {
		int pos;
		PositionEnum position = null;

		// �ڵ� �ۼ�
		while(true) {
			System.out.print("== ���� ���: ");
			for(PositionEnum d : PositionEnum.values()) {
				System.out.print(d.getMessage() + "(" + d.getCode() + ") ");
			}
			System.out.println("");
			pos = Utils.checkInputInteger(s, ">> position: ");
			
			// ��ȿ�� �� �Է� Ȯ��
			boolean valid = false;
			for(PositionEnum d : PositionEnum.values()) {
				if(pos == d.getCode()) {
					valid = true;
					position = d;
					break;
				}
			}

			if(valid) {
				break;
			}
		}
		
		
		return position;
	}
	
	public static int getGrade(Scanner s) {
		int grade = -1;
		
		// �ڵ� �ۼ�
		System.out.print(">> grade: ");
		grade = s.nextInt(); 
		return grade;
	}

	public static int getHours(Scanner s) {
		int hours = -1;
		
		// �ڵ� �ۼ�
		
		System.out.print(">> hours: ");
		hours = s.nextInt(); 
		
		return hours;
	}
}