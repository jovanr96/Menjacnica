package menjacnica;

import java.util.GregorianCalendar;

public class Valuta {
	
	private String naziv;
	private String skraceniNaziv;
	private GregorianCalendar datum;
	private Kurs kurs;
	
	public Valuta(String naziv, String skraceniNaziv, GregorianCalendar datum, Kurs kurs) {
		super();
		this.naziv = naziv;
		this.skraceniNaziv = skraceniNaziv;
		this.datum = datum;
		this.kurs = kurs;
	}
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv == null || naziv.equals(""))
			throw new RuntimeException("Greska pri unosu naziva valute!");
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if (skraceniNaziv == null || skraceniNaziv.equals(""))
			throw new RuntimeException("Greska pri unosu skracenog naziva valute!");
		this.skraceniNaziv = skraceniNaziv;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if (datum == null)
			throw new RuntimeException("Greska pri unosu datuma!");
		this.datum = datum;
	}
	public Kurs getKurs() {
		return kurs;
	}
	public void setKurs(Kurs kurs) {
		if (kurs == null)
			throw new RuntimeException("Greska pri unosu kursa!");
		this.kurs = kurs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((kurs == null) ? 0 : kurs.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
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
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (kurs == null) {
			if (other.kurs != null)
				return false;
		} else if (!kurs.equals(other.kurs))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Naziv valute: "+naziv+"( "+skraceniNaziv+" )\nKurs za datum "+datum+"\n"+
				kurs.toString();
	}
	

}
