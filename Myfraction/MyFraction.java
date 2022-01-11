import java.lang.*;
class MyFraction implements Fraction{
	private int nom;
	private int denom;

	MyFraction(){
		this.nom = 1;
		this.denom = 1;
	}

	MyFraction(int nom, int denom){
		if(denom == 0)
			throw new IllegalArgumentException("denominator can not be zero");

		if(denom < 0){
			throw new IllegalArgumentException("denominator can not be negative");
		}

		this.nom = nom;
		this.denom = denom;
	}
	//
	public void setter(int nom, int denom){
		if(denom == 0){
			IllegalArgumentException e = new IllegalArgumentException("denominator can not be zero");
			throw e;
		}

		if(denom < 0){
			throw new IllegalArgumentException("denominator can not be negative");
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

	public MyFraction minus(MyFraction f){
		MyFraction result; 
		if(f.denom == this.denom){
			return new MyFraction(this.nom - f.nom, this.denom);
		}

		int n_denom = this.denom * f.denom;
		int n_nom = this.nom * f.denom - f.nom * this.denom;
		result = simplifyFactor(n_nom, n_denom);
		return result;
	}

	public MyFraction multiply(MyFraction f){
		if(f.denom == 0)
			throw new IllegalArgumentException("denominator can not be zero");
		int n_denom = f.denom * this.denom;
		int n_nom = f.nom * this.nom;

		MyFraction result = simplifyFactor(n_nom, n_denom);
		return result;
	}

	public MyFraction divide(MyFraction f){
		f.reciprocal();
		return this.multiply(f);
	}

	public void reciprocal(){
		if(this.nom == 0){
			throw new IllegalArgumentException("Illegal reciprocal: nominator is Zero");
		}
		int temp = this.nom;
		if(this.nom < 0 ){
			this.nom = this.denom * (-1);
			this.denom = temp * (-1);
		}else{
			this.nom = this.denom;
			this.denom = temp;
		}
	}

	public boolean compare(MyFraction f){
		MyFraction self = simplifyFactor(this.nom, this.denom);
		MyFraction other = simplifyFactor(f.nom, f.denom);
		if(self.nom == other.nom && self.denom == other.denom)
			return true;
		return false;
	}
	//Return MyFraction Object with simplified Factor
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