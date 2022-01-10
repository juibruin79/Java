import java.lang.*;
class MyFraction implements Fraction{
	int nom;
	int denom;

	MyFraction(){
		this.nom = 1;
		this.denom = 1;
	}

	MyFraction(int nom, int denom){
		if(denom == 0)
			throw new IllegalArgumentException("denominator can not be zero");

		this.nom = nom;
		this.denom = denom;
	}
	//
	public void setter(int nom, int denom){
		if(denom == 0){
			IllegalArgumentException e = new IllegalArgumentException("denominator can not be zero");
			throw e;
		}
		this.nom = nom;
		this.denom = denom;
	}

	public MyFraction getter(){
		return new MyFraction(this.nom, this.denom);
	}

	public String toString(){
		String s_nom = Integer.toString(nom);
		String s_denom = Integer.toString(denom);
		String str = s_nom + "/" + s_denom;
		return str;
	}

}