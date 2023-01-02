package RENOS;

public class Start {

	public static void main(String[] args) {
		
		
		//Creamos dos Robot´s
		Robot Peleon = new Robot("Firulais");
		Peleon.getPuntosVida();
		Peleon.getAtaque();
		Peleon.getDefensa();
	
		System.out.println(Peleon);
		
		Robot Bola = new Robot("Chapa");
		Bola.getPuntosVida();
		Bola.getAtaque();
		Bola.getDefensa();
		
		System.out.println(Bola);
	
		

	}

}
