package RENOS;

public class Robot {
	
	//ATRIBUTOS
	private String nombre;
	private int puntosVida;
	private int ataque;
	private int defensa;
	
	
	//CONSTRUCTORES
	public Robot (String nombre) {
		
		this.nombre=nombre;
		this.puntosVida=100;
		this.ataque= (int)(Math.random()*+20);
		this.defensa= (int)(Math.random()*+100);
		
	}
	
	private void generarAteque() {
		
		int ataque= (int)(Math.random()*+20);
		while (puntosVida>0) {
			
			
			
		}
		
	
	}
	
	
	
	


	
	//GETTERS
	public String getNombre() {
		return nombre;
	}
	public float getPuntosVida() {
		return puntosVida;
	}
	public float getAtaque() {
		return ataque;
	}
	public float getDefensa() {
		return defensa;
	}
	
	
	//SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	
	public String toString() {
		return "Robot [nombre=" + nombre + ", puntosVida=" + puntosVida + ", ataque=" + ataque + ", defensa=" + defensa
				+ "]";
	}
	
	

}


