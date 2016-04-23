package pet;

public class Pet {
	private String name ;
	private String kind ;
	private int age ;
	
	public void eat() {
		System.out.println("狂吃狂吃狂吃...");
	}
	public void bone() {
		System.out.println("叫声叫声叫声....");
	}
	
	//实现getter获取和setter实现  方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 20 || age < 0){
			System.out.println("age数据有误");
		}
		else
			this.age = age;
	}	
}
