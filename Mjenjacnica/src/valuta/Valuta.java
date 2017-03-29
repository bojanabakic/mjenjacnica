package valuta;

import java.util.GregorianCalendar;

public class Valuta {
	private String naziv;
	private String skraceniNaziv;
	
	private GregorianCalendar datumUnosaKursa;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;
	
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}
	public GregorianCalendar getDatumUnosaKursa() {
		return datumUnosaKursa;
	}
	public void setDatumUnosaKursa(GregorianCalendar datumUnosaKursa) {
		this.datumUnosaKursa = datumUnosaKursa;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		this.prodajniKurs = prodajniKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		this.kupovniKurs = kupovniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		this.srednjiKurs = srednjiKurs;
	}
	
	
}
