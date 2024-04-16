package de.demmer.dennis;

public class Bankkonto {
	
	private double guthaben;
	private int iban;
	private String kontoinhaber;
	
	
	
	
	public Bankkonto(double guthaben, int iban, String kontoinhaber) {
		super();
		this.guthaben = guthaben;
		this.iban = iban;
		this.kontoinhaber = kontoinhaber;
	}
	
	
	
	public double getGuthaben() {
		return guthaben;
	}
	public void setGuthaben(double guthaben) {
		this.guthaben = guthaben;
	}
	public int getIban() {
		return iban;
	}
	public void setIban(int iban) {
		this.iban = iban;
	}
	public String getKontoinhaber() {
		return kontoinhaber;
	}
	public void setKontoinhaber(String kontoinhaber) {
		this.kontoinhaber = kontoinhaber;
	}
	
	
	
	
	

}
