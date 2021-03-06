package menjacnica;

public class Kurs {

	private double prodajniKurs;
	private double srednjiKurs;
	private double kupovniKurs;
	
	
	
	public Kurs(double prodajniKurs, double srednjiKurs, double kupovniKurs) {
		super();
		this.prodajniKurs = prodajniKurs;
		this.srednjiKurs = srednjiKurs;
		this.kupovniKurs = kupovniKurs;
	}

	public double getProdajniKurs() {
		return prodajniKurs;
	}

	public void setProdajniKurs(double prodajniKurs) {
		if (prodajniKurs <= 0)
			throw new RuntimeException("Doslo je do greske pri unosu prodajnog kursa!");
		this.prodajniKurs = prodajniKurs;
	}

	public double getSrednjiKurs() {
		return srednjiKurs;
	}

	public void setSrednjiKurs(double srednjiKurs) {
		if (srednjiKurs <= 0)
			throw new RuntimeException("Doslo je do greske pri unosu srednjeg kursa!");
		this.srednjiKurs = srednjiKurs;
	}

	public double getKupovniKurs() {
		return kupovniKurs;
	}

	public void setKupovniKurs(double kupovniKurs) {
		if (kupovniKurs <= 0)
			throw new RuntimeException("Doslo je do greske pri unosu kupovnog kursa!");
		this.kupovniKurs = kupovniKurs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kurs other = (Kurs) obj;
		if (Double.doubleToLongBits(kupovniKurs) != Double.doubleToLongBits(other.kupovniKurs))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double.doubleToLongBits(other.prodajniKurs))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double.doubleToLongBits(other.srednjiKurs))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Kupovni kurs: "+kupovniKurs+" Srednji kurs: "+srednjiKurs+" Prodajni kurs: "+prodajniKurs;
	}
}
