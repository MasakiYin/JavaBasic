package practice13.common;

/*
 * ★ common.Personクラスを継承して、common.Employeeクラスを作成してください
 *
 * フィールド
 * 		departmentNm（部署名）		:	String
 * 		departmentCnt（部署人数）	:	int
 * メソッド
 * 		各フィールドのアクセサ
 */



public class Employee extends Person{
	private String departmentNm;
	private int departmentCnt;
	
	public String getDepartmentNm() {
		return this.departmentNm;
	}
	public int getDepartmentCnt() {
		return this.departmentCnt;
	}
	
	public void setDepartmentNm(String departmentNm) {
		this.departmentNm = departmentNm;
	}
	public void setDepartmentCnt(int departmentCnt) {
		this.departmentCnt = departmentCnt;
	}
}
