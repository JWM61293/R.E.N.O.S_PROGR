package RENOS;

public class Robot {
	
	//ATRIBUTOS
	private String nombre;
	private int puntosVida;
	private int ataque= (int)(Math.random()*20);
	private int defensa= (int)(Math.random()*100);;
	
	
	//CONSTRUCTORES
	public Robot (String nombre,int puntosVida) {
		//Son valores que no varian
		this.nombre=nombre;
		this.puntosVida= 100;
		/* 
		 * Valores aleatorios
		this.ataque=generarAtaque(); 
		this.defensa=generarDefensa();
		*/
	}
	
	
		private float generarAtaque() {
			
			
			
			return ataque;
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
	public void setPuntosVida(float puntosVida) {
		this.puntosVida = puntosVida;
	}
	public void setAtaque(float ataque) {
		this.ataque = ataque;
	}
	public void setDefensa(float defensa) {
		this.defensa = defensa;
	}
	
	
	public String toString() {
		return "Robot [nombre=" + nombre + ", puntosVida=" + puntosVida + ", ataque=" + ataque + ", defensa=" + defensa
				+ "]";
	}
	
	

}


