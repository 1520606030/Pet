package pet;

public class Pet {
	private String name ;
	private String kind ;
	private int age ;
	
	public void eat() {
		System.out.println("��Կ�Կ��...");
	}
	public void bone() {
		System.out.println("������������....");
	}
	
	//ʵ��getter��ȡ��setterʵ��  ����
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
			System.out.println("age��������");
		}
		else
			this.age = age;
	}	
}
