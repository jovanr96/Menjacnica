package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import metode.Metode;

public class Menjacnica implements Metode {
	LinkedList<Valuta> valute = new LinkedList<Valuta>();

	@Override
	public void dodavanjeKursaValute(String naziv, String skraceniNaziv, GregorianCalendar datum, double kupovniKurs,
			double prodajniKurs, double srednjiKurs) {

		Kurs kurs = new Kurs(prodajniKurs, srednjiKurs, kupovniKurs);
		Valuta valuta = new Valuta(naziv, skraceniNaziv, datum, kurs);
		valute.add(valuta);

	}

	@Override
	public void brisanjeKursaValuteZaOdredjeniDatum(String naziv, GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++)
			if (valute.get(i).getNaziv().equals(naziv) && valute.get(i).getDatum().equals(datum))
				valute.remove(i);

	}

	@Override
	public Kurs pronalazenjeKursaValuteZaOdredjeniDan(String naziv, String skraceniNaziv, GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++)
			if (valute.get(i).getNaziv().equals(naziv) && 
					valute.get(i).getSkraceniNaziv().equals(skraceniNaziv)
					&& valute.get(i).getDatum().equals(datum))
				return valute.get(i).getKurs();
		return null;
	}

}
