package JavaPolimorfismo;

public class CavaloClass extends AnimalClass{

	// Atributos
	String cor;
	
	// Construtor
	public CavaloClass (String nome, int idade, String especie,String raca, String cor) {
		super(nome, idade, especie, raca);
		this.cor = cor;
	}
	
	// M�todos
	@Override
	public void print() {
		System.out.print(" CAVALO");
		System.out.print("\n Nome: "+getNome());
		System.out.print("\n Idade: "+getIdade());
		System.out.print("\n Esp�cie: "+getEspecie());
		System.out.print("\n Ra�a: "+getRaca());
		System.out.print("\n Cor: "+cor);
	}
	
	@Override
	public void som(String som) {
		System.out.print("\n O cavalo come�ou a RINCHAR!!\n "+som);
	}
	
	@Override
	public void correr(int correr) {
		System.out.print("\n O cavalo come�ou a CORRER!!\n Na velocidade de "+correr+"Km/h");
	}

	// Get e Set
	public String getCor() { return cor; }

	public void setCor(String cor) { this.cor = cor;}
	
}