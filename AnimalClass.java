package JavaPolimorfismo;

public abstract class AnimalClass {

	// Atributos
	private String nome;
	private int idade;
	private String especie;
	private String raca;
	
	// Construtor
	public AnimalClass (String nome, int idade, String especie, String raca) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.especie = especie;
		this.raca = raca;
	}

	abstract public void print();
	abstract public void som(String som);
	abstract public void correr(int correr);
	
	// Get e Set
	public String getNome() {return nome; }

	public void setNome(String nome) {this.nome = nome;}

	public int getIdade() { return idade; }

	public void setIdade(int idade) { this.idade = idade; }

	public String getEspecie() { return especie; }

	public void setEspecie(String especie) { this.especie = especie; }

	public String getRaca() { return raca; }

	public void setRaca(String raça) { this.raca = raça; }
	
}