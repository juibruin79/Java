import java.util.*;
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

		System.out.println("--------referTest------");
		int[] lst = {1,2,3,4,5,6,7};
		int a = 10;
		Test t = new Test();
		t.referTest(lst, a, ele);

		System.out.println(Arrays.toString(lst));
		System.out.println(a);
		ele.speak();


	}


	public void referTest(int[] lst, int a, Animal ani){
		lst[0] = 7;
		a = 0;
		ani.age = 100;

	}
}