package employeeTest;
import java.util.Scanner;

import employee.EmployeeSet;
import menus.MainMenuEnum;
import menus.Menu;
import menus.RegisterMenuEnum;
import menus.SearchMenuEnum;
import menus.UpdateMenuEnum;
import menus.DeleteMenuEnum;

public class EmployeeTest {

	public static void main(String[] args) {
		Menu menu = new Menu();
		Scanner scanner = new Scanner(System.in);
		EmployeeSet set = new EmployeeSet();
		MainMenuEnum mm = menu.MainMenu(scanner);  //등록 또는 검색 후 MainMenu로 돌아가는 문제 -> 반복문 앞에 넣어주고 RETURN시에만 MainMenu로 가게끔
		
		while(true) {
			if(mm == MainMenuEnum.REGISTER) {
				// 직원 등록 메뉴 출력 및 입력 처리
				RegisterMenuEnum rm = menu.RegisterMenu(scanner); 
				if (rm == RegisterMenuEnum.FULLTIME)
					set.RegisterFullTimeEmp(scanner);
				else if (rm == RegisterMenuEnum.PARTTIME)
					set.RegisterPartTimeEmp(scanner);
				else if (rm == RegisterMenuEnum.RETURN)
					mm = menu.MainMenu(scanner);
					continue;
			}
			else if(mm == MainMenuEnum.SEARCH) {
				// 직원 정보 출력 메뉴 출력 및 입력 처리
				SearchMenuEnum sm = menu.SearchMenu(scanner);
				if (sm == SearchMenuEnum.SEARCH)
					set.SearchAll();
				else if (sm == SearchMenuEnum.PART_SEARCH)
					set.SearchParttime();
				else if (sm == SearchMenuEnum.FULL_SEARCH)
					set.SearchFulltime();
				else if (sm == SearchMenuEnum.NAME_SEARCH)
					set.SearchName(scanner);
				else if (sm == SearchMenuEnum.RETURN)
					mm = menu.MainMenu(scanner);
					continue;
			}
			else if(mm == MainMenuEnum.UPDATE) {
				// 직원 정보 출력 메뉴 출력 및 입력 처리
				UpdateMenuEnum um = menu.UpdateMenu(scanner);
				if (um == UpdateMenuEnum.UPDATE)
					set.UpdateName(scanner);
				else if (um == UpdateMenuEnum.RETURN)
					mm = menu.MainMenu(scanner);
					continue;
			}
			else if(mm == MainMenuEnum.DELETE) {
				// 직원 정보 출력 메뉴 출력 및 입력 처리
				DeleteMenuEnum dm = menu.DeleteMenu(scanner);
				if (dm == DeleteMenuEnum.DELETE)
					set.DeleteName(scanner);
				else if (dm == DeleteMenuEnum.RETURN)
					mm = menu.MainMenu(scanner);
					continue;
			}
			else if(mm == MainMenuEnum.EXIT) {
				System.out.print("Good BYE!");
				break;
			}
		}
		scanner.close();
	}
}