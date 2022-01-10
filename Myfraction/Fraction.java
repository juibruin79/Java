public interface Fraction{
	public String toString();
	public void setter(int nom, int denom);
	public MyFraction getter();
	public MyFraction add(MyFraction f);
	// public minus(MyFraction f1, MyFraction f2);
	public MyFraction multiply(MyFraction f1);
	// public divide(MyFraction f1, MyFraction f2);
	public void reciprocal();
	public boolean compare(MyFraction f);
}