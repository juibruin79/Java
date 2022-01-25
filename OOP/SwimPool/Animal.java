class Animal{
	int age; 
	int weight; 

	Animal(int age, int weight){
		this.age = age;
		this.weight = weight;
	}

	public void speak(){
		System.out.print("Weight : " + weight);
		System.out.println(" Age : " + age);
	}
}