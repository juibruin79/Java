class Test{
	public static void main(String[] args){
		Animal dolp = new Swimmable(1,1200,"dolphine");

		SwimmingPool pool = new SwimmingPool();
		pool.enterPool(dolp);
	}
}