package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import metode.Metode;

public class Menjacnica implements Metode {

	LinkedList<Valuta> valute = new LinkedList<Valuta>();

	@Override
	public void dodavanjeKursaValute(String naziv, String skraceniNaziv, GregorianCalendar datum, double kupovniKurs,
			double prodajniKurs, double srednjiKurs) {

		Kurs k = new Kurs(prodajniKurs, srednjiKurs, kupovniKurs);
		Valuta v = new Valuta(naziv, skraceniNaziv, datum, k);
		valute.addFirst(v);

	}

	@Override
	public void brisanjeKursaValuteZaOdredjeniDatum(String naziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public Kurs pronalazenjeKursaValuteZaOdredjeniDan(String naziv, String skraceniNaziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
