package practice3.model.vo;

public class Cat extends Animal{
	
	private String location;
	private String color;
	
	public Cat() {}
	
	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
		
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocation() {
		return location;
	}
	
	public void setColor() {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	
	@Override
	public void speak() {
		
		System.out.println(super.toString() + location + "�� �����ϸ�, ������ " + color + "�Դϴ�.");
	}
	
	
	
	
	
	
	
	
	
	

}
