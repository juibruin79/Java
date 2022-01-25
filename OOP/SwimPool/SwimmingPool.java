class SwimmingPool{
	public void enterPool(Animal animal){
		if(animal instanceof Swimmable){
			animal.speak();
			//interface to be static
			Swim.swim(25);
			//cast parent class to children class because parent class doent have Swim interface
			((Swimmable)animal).eat("Shrimps");

		}else
			System.out.println("rejected to the pool");
	}
}