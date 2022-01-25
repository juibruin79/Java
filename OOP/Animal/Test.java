class Test{
	public static void main(String[] args){
		Animal animal = new Animal(3,8);
		Elephant el = new Elephant(8,1200, "Elephant");

		System.out.println("Animal Speaks ");
		animal.speak();

		System.out.println("Elephant Speaks");
		el.speak();

		//Polymorphism
		System.out.println("----Elephant Speaks------");
		Animal ele = new Elephant(8, 1200, "ele the Elephant");
		ele.speak();

		//instanceof operator: return true if the class is the same false otherwise. 
		System.out.println(el instanceof Animal);

		System.out.println(animal instanceof Elephant);
	}
}