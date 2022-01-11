public interface Fraction{
	public String toString();
	public void setter(int nom, int denom);
	public MyFraction getter();
	public MyFraction add(MyFraction f);
	public MyFraction minus(MyFraction f);
	public MyFraction multiply(MyFraction f);
	public MyFraction divide(MyFraction f);
	public void reciprocal();
	public boolean compare(MyFraction f);
}