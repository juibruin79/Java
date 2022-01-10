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

	public MyFraction add(MyFraction f){

		if(f.denom == this.denom){
			return new MyFraction(f.nom + this.nom, f.denom);
		}

		int n_denom = f.denom * this.denom;
		int n_nom = f.nom * this.denom + this.nom * f.denom;
		MyFraction result = simplifyFactor(n_nom, n_denom);

		return result;

	}

	private MyFraction simplifyFactor(int nom ,int denom){
		int gcd = 1;
		for(int i = 1; i <= nom && i <= denom; i++){
			if(nom%i == 0 && denom % i == 0){
				gcd = i;
			}
		}

		nom = nom / gcd;
		denom = denom / gcd;

		return new MyFraction(nom, denom);
	}

	public String toString(){
		String s_nom = Integer.toString(nom);
		String s_denom = Integer.toString(denom);
		String str = s_nom + "/" + s_denom;
		return str;
	}

}