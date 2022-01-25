interface Swim{
	final String swim = "marin creatures";
	//This can only be called staticly "Swim.swim(16)" for instance. 
	public static void swim(int speed){
		System.out.println("A " + swim + "Swim : " + speed);
	}

	public void eat(String food);
}
