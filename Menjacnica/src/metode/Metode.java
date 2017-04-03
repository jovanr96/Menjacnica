package metode;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface Metode {

	public void dodavanjeKursaValute(String naziv, String skraceniNaziv, GregorianCalendar datum,
			double kupovniKurs, double prodajniKurs, double srednjiKurs);

	public void brisanjeKursaValuteZaOdredjeniDatum(String naziv, GregorianCalendar datum);

	public Kurs pronalazenjeKursaValuteZaOdredjeniDan(String naziv, String skraceniNaziv, 
			GregorianCalendar datum);
}
