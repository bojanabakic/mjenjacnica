package specifikacijaInterfejsa;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import valuta.Valuta;

public class MjenjacnicaRadi implements KursMetode {
	LinkedList<Valuta> kursnaLista = new LinkedList<Valuta>();
	
	@Override
	public void dodajKurs(String naziv, String skraceniNaziv, GregorianCalendar datum, double kupovniKurs,
			double prodajniKurs, double srednjiKurs) {
		Valuta novaValuta = new Valuta();
		novaValuta.setNaziv(naziv);
		novaValuta.setSkraceniNaziv(skraceniNaziv);
		novaValuta.setDatumUnosaKursa(datum);
		novaValuta.setKupovniKurs(kupovniKurs);
		novaValuta.setProdajniKurs(prodajniKurs);
		novaValuta.setSrednjiKurs(srednjiKurs);
		
		kursnaLista.add(novaValuta);
	}

	@Override
	public void obrisiKurs(String naziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public Valuta vratiKurs(String naziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
