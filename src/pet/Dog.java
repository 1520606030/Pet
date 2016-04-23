package pet;

public class Dog extends Pet{
	public String watch() {
		return "狗看门";
	}
	//方法重写
	public void eat() {
		System.out.println("狂吃狂吃狂吃--->骨头");
	}
	public void bone() {
		System.out.println("叫声叫声叫声--->汪汪汪");
	}
}
