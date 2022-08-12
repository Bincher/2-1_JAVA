package menus;

public enum SearchMenuEnum {
	SEARCH(21, "�ϰ� �˻�"),
	FULL_SEARCH(22, "������ �˻�"),
	PART_SEARCH(23, "�ӽ��� �˻�"),
	NAME_SEARCH(24, "�̸� �˻�"),
	RETURN(29, "���ư���");
	
	int code;
	String message;
	
	SearchMenuEnum(int code, String message) {
		this.code = code;
		this.message = message;
		//System.out.println("������ in MainMenuEnum: " + code);
	}
	
	public int getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	}
}
