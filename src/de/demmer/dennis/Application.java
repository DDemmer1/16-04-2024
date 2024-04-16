package de.demmer.dennis;

public class Application {
	
	public static void main(String[] args) {
	
		Bankkonto b1 = new Bankkonto(0.0, 12345, "Dennis Demmer");
//		b1.guthaben = 10;
		
		b1.setGuthaben(-2000);
	}
}
