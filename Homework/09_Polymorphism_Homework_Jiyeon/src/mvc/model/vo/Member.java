package mvc.model.vo;

public class Member {
	
	private String name;
	private int age;
	private char gender;
	private int couponCount;
	
	
	public Member() {}
	
	public Member(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	
	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}
	public int getCouponCount() {
		return couponCount;
	}
	
	
	
	public String toString() {
		return "회원명 : " +name+ ", 회원나이 : "+age+ ", 성별 : " +gender+ "자";
	}
	
	
	
	
	
	
	
	

}
