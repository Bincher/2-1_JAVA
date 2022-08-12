package menus;

public enum UpdateMenuEnum {
	UPDATE(31, "���� ����(by id)"),
	RETURN(39, "���ư���");
	
	int code;
	String message;
	
	UpdateMenuEnum(int code, String message) {
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
