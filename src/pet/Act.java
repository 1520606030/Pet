package pet;

public class Act {
	public static void main(String[] args) {
		//è������+��Ϊ
				Cat cat = new Cat();
				cat.setName("Сè");
				cat.setAge(9);
				cat.setKind("è��");
				System.out.println("Cat's name is " + "\t" + cat.getName());
				System.out.println("Cat's age is " + "\t" + cat.getAge() + "��");
				System.out.println("Cat's kind is " + "\t" + cat.getKind());
				
				//��д��������
				cat.eat();
				cat.bone();
				String cm = cat.catchMonse();
				System.out.println(cm);
				System.out.println("****************************");
				
				//��������+��Ϊ
				Dog dog = new Dog();
				dog.setName("С��");
				dog.setAge(3);
				dog.setKind("Ȯ��");
				System.out.println("Dog's name is " + "\t" + dog.getName());
				System.out.println("Dog's age is " + "\t" + dog.getAge()+ "��");
				System.out.println("Dog's kind is " + "\t" + dog.getKind());
				
				//��д��������
				dog.eat();
				dog.bone();
				String wt = dog.watch();
				System.out.println(wt);
	}
	
	
	
	
	
	
}
