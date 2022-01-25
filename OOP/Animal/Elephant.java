class Elephant extends Animal{
	String name;
	Elephant(int age, int weight,String name){
		super(age, weight);
		this.name = name;
	}
	public void speak(){
		//inherit parent class' method 
		super.speak();
		System.out.println("Name : " + name );
	}
}