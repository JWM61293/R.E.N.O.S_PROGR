package RENOS;

public class Robot {
	
	//ATRIBUTOS
	private String nombre;
	private double puntosVida;
	private int ataque;
	private int defensa;
	
	
	//CONSTRUCTORES
	public Robot (String nombre) {
		
		this.nombre=nombre;
		this.puntosVida=100;
		generarAtaque();     
		generarDefensa();   
		
	}
	
	/**
	 * Vamos a generar constantemente ataques mientras el robot tenga puntos de vida 
	 * 
	 */
	private void generarAtaque() {
		
			int ataque= (int)(Math.random()*+20);
			int defensa=(int)(Math.random()*+100);
			
			for(int puntosVida=100;puntosVida>0; puntosVida-- ) {
				if(ataque>defensa) {
					defensa--;
					
				}
				else if (ataque<defensa) {
					ataque=defensa;
				}
			}
		
		
	}

	
	
	private void generarDefensa() {
		
		int defensa = (int)(Math.random()*+100);
		int ataque= (int)(Math.random()*+20);
		
		if(defensa>ataque) {
			defensa=defensa;
		}
		
		
	}
	
	
	
	//GETTERS
	public String getNombre() {
		return nombre;
	}
	public double getPuntosVida() {
		return puntosVida;
	}
	public int getAtaque() {
		return ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	
	
	//SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPuntosVida(double puntosVida) {
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


