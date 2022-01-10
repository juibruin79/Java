

class DogTestDrive{
	public static void main(String[] args){
		System.out.println("Hello World");
		Dog poodle = new Dog("Sam");
		poodle.bark();

		//calling thee class itself.
		DogTestDrive tester = new DogTestDrive();
		tester.testBark("Ewwwww");
	}

	public void testBark(String sound){
		System.out.println(sound+"!!!");
	}
}


//Class Definition
class Dog{
	String name;
	Dog(String name){
		this.name = name;
	}

	public void bark(){
		System.out.println("Woof!!!");
	}
}