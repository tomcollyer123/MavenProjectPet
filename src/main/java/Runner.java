
public class Runner {

	public static void main(String[] args) {
	
//	Creating now objects	
		Pet pet = new Pet();
		Cat cat = new Cat();
		Dog dog = new Dog();
	
//	Calling the method from each class with cat and dog override	
		System.out.println(pet.makeNoise());
		System.out.println(dog.makeNoise());
		System.out.println(cat.makeNoise());
		
//	This is calling the doThing method. As I have sysout in the method in pet, I don't need to put sysout in the runner class.	
		
		pet.doThing();
		dog.doThing();
		cat.doThing();
	}
}
