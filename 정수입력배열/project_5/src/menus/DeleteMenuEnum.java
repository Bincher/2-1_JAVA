package menus;

public enum DeleteMenuEnum {
	DELETE(41, "���� ���� (by id)"),
	RETURN(49, "���ư���");

	
	int code;
	String message;
	
	DeleteMenuEnum(int code, String message) {
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