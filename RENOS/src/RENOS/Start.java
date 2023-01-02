package RENOS;

public class Start {

	public static void main(String[] args) {
		
		
		//Creamos dos Robot´s
		Robot Peleon = new Robot("Firulais");
		Peleon.setPuntosVida(100);
		Peleon.setAtaque(10);
		Peleon.setDefensa(50);
	
		System.out.println(Peleon);
		
		Robot Bola = new Robot("Chapa");
		Bola.setPuntosVida(100);
		Bola.setAtaque(15);
		Bola.setDefensa(80);
		
		System.out.println(Bola);
	
		

	}

}
