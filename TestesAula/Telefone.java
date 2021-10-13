package JavaPolimorfismo;

public abstract class Telefone {

	// Atributos
	private String tipo;
	
	// Construtor
	public Telefone (String tipo) {
		this.tipo = tipo;
	}
	
	// Métodos Abstratos
	abstract public void disca(String numero);
	abstract public void toca(int numToques);
	
	// Get e Set
	public String getTipo() { return tipo; }
	
	public void setTipo(String tipo) { this.tipo = tipo;}
	
}
