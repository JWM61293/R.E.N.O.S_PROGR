package R.E.N.O.S;

public class Robot {
	
	private String nombre;
	private float puntosVida;
	private float ataque;
	private float defensa;
	
	
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
	@Override
	public String toString() {
		return "Robot [nombre=" + nombre + ", puntosVida=" + puntosVida + ", ataque=" + ataque + ", defensa=" + defensa
				+ "]";
	}
	
	

}
