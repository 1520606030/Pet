package pet;

public class Act {
	public static void main(String[] args) {
		//猫的属性+行为
				Cat cat = new Cat();
				cat.setName("小猫");
				cat.setAge(9);
				cat.setKind("猫科");
				System.out.println("Cat's name is " + "\t" + cat.getName());
				System.out.println("Cat's age is " + "\t" + cat.getAge() + "岁");
				System.out.println("Cat's kind is " + "\t" + cat.getKind());
				
				//重写方法调用
				cat.eat();
				cat.bone();
				String cm = cat.catchMonse();
				System.out.println(cm);
				System.out.println("****************************");
				
				//狗的属性+行为
				Dog dog = new Dog();
				dog.setName("小狗");
				dog.setAge(3);
				dog.setKind("犬科");
				System.out.println("Dog's name is " + "\t" + dog.getName());
				System.out.println("Dog's age is " + "\t" + dog.getAge()+ "岁");
				System.out.println("Dog's kind is " + "\t" + dog.getKind());
				
				//重写方法调用
				dog.eat();
				dog.bone();
				String wt = dog.watch();
				System.out.println(wt);
	}
	
	
	
	
	
	
}
