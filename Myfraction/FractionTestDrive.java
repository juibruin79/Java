class FractionTestDrive{
	public static void main(String[] args){
		System.out.println("Hello FractionTestDrive");
		MyFraction answer;
		MyFraction f1 = new MyFraction(1,3);
		answer = f1.add(new MyFraction(1,6));
		System.out.println(answer.toString());
		System.out.println(f1.compare(new MyFraction(2,6)));
		System.out.println(f1.compare(new MyFraction(2,4)));
		f1.reciprocal();
		System.out.println(f1.toString());


	}
}