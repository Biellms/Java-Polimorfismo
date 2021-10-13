package JavaPolimorfismo;

public class CavaloClass extends AnimalClass{

	// Atributos
	String cor;
	
	// Construtor
	public CavaloClass (String nome, int idade, String especie,String raca, String cor) {
		super(nome, idade, especie, raca);
		this.cor = cor;
	}
	
	// Métodos
	@Override
	public void print() {
		System.out.print(" CAVALO");
		System.out.print("\n Nome: "+getNome());
		System.out.print("\n Idade: "+getIdade());
		System.out.print("\n Espécie: "+getEspecie());
		System.out.print("\n Raça: "+getRaca());
		System.out.print("\n Cor: "+cor);
	}
	
	@Override
	public void som(String som) {
		System.out.print("\n O cavalo começou a RINCHAR!!\n "+som);
	}
	
	@Override
	public void correr(int correr) {
		System.out.print("\n O cavalo começou a CORRER!!\n Na velocidade de "+correr+"Km/h");
	}

	// Get e Set
	public String getCor() { return cor; }

	public void setCor(String cor) { this.cor = cor;}
	
}