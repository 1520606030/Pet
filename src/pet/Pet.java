package pet;

public class Pet {
	
	//猫狗共有属性
	private String name ;
	private String kind ;
	private int age ;
	
	//猫狗共有方法（在各自的类(Pet的子类)中进行方法重写）
	//猫狗饮食与叫声
	public void eat() {
	}
	public void bone() {
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
