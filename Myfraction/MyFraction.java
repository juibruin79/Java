class MyFraction implements Fraction{
	int nom;
	int denom;

	MyFraction(int nom, int denom){
		this.nom = nom;
		this.denom = denom;
	}

	public void setter(int nom, int denom){
		this.nom = nom;
		this.denom = denom;
	}

	public String toString(){
		String str = "My Fraction.";
		return str;
	}

}