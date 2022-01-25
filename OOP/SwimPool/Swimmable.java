class Swimmable extends Animal implements Swim{
	String name;
	Swimmable(int age, int weight, String name){
		super(age, weight);
		this.name = name;

	}

	public void speak(){
		super.speak();
		System.out.println(name + " and I can swim !");
	}

	public void eat(String food){
		System.out.println( name + " eats " + food);
	}


}