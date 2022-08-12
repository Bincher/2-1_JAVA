import java.util.Scanner;

public class EmployeeSet {
	final int MAX_SIZE = 100;	// 배열 길이
	Employee [] emp;			// 직원
	int indexEmp;				// 등록된 직원에 대한 인원 수 
	
	public EmployeeSet() {
		emp = new Employee[MAX_SIZE];
		indexEmp = 0;
	}
	
	public void RegisterEmp(Scanner s) {
		System.out.println("");
		System.out.println(">>> 직원 등록 <<<");
		
		int id = 10101 + indexEmp;
		System.out.print(">> name: ");
		String name = s.next();
		System.out.print("== 부서 목록: 총무(11) 인사(12) 기획(13) 생산(14) 영업(15)\n>> department: ");
		int dept = s.nextInt();
		System.out.print("== 직위 목록: 이사(21) 부장(22) 과장(23) 대리(24) 사원(25)\n>> position: ");
		int position = s.nextInt();
		System.out.print(">> grade: ");
		int grade = s.nextInt();
		// 코드 작성
		// 이름, 부서, 직위, 호봉 입력
		
		emp[indexEmp] = new Employee(id, name, dept, position, grade);
		indexEmp++;

		s.nextLine(); // 버퍼 비움
	}

	public void SearchAll() {
		// 코드 작성
		// 직원 정보 출력
		for (int i = 0; i < indexEmp; i++)
		{
			System.out.println("\n================");
			System.out.printf("id: %d\n", emp[i].getId());
			System.out.printf("name: %s\n", emp[i].getName());
			switch(emp[i].getDept())
			{
			case 11:
				System.out.println("department: 총무");
				break;
			case 12:
				System.out.println("department: 인사");
				break;
			case 13:
				System.out.println("department: 기획");
				break;
			case 14:
				System.out.println("department: 생산");
				break;
			case 15:
				System.out.println("department: 영업");
				break;
			}
			switch(emp[i].getPosition())
			{
			case 21:
				System.out.println("position: 이사");
				break;
			case 22:
				System.out.println("position: 부장");
				break;
			case 23:
				System.out.println("position: 과장");
				break;
			case 24:
				System.out.println("position: 대리");
				break;
			case 25:
				System.out.println("position: 사원");
				break;
			}
			System.out.printf("grade: %d\n", emp[i].getGrade());
		}
	}
}