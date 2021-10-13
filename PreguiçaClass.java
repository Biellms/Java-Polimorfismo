package JavaPolimorfismo;

public class PreguiçaClass extends AnimalClass{

	// Atributos
	int tamanho;
	
	// Construtor
	public PreguiçaClass (String nome, int idade, String especie, String raca, int tamanho) {
		super(nome, idade, especie, raca);
		this.tamanho = tamanho;
	}
	
	// Métodos
	@Override
	public void print() {
		System.out.print(" BICHO-PREGUIÇA");
		System.out.print("\n Nome: "+getNome());
		System.out.print("\n Idade: "+getIdade());
		System.out.print("\n Espécie: "+getEspecie());
		System.out.print("\n Raça: "+getRaca());
		System.out.print("\n Tamanho: "+tamanho+"cm");
	}
	
	@Override
	public void som(String som) {
		System.out.print("\n O preguiça começou a EMITIR um som!!\n "+som);
	}
	
	@Override
	public void correr(int correr) {
		System.out.print("\n A preguiça não corre poh kkkkkkk");
	}
	
	public void subir() {
		System.out.print("\n A preguiça começou a SUBIR a árvore!!");
	}

	// Get e Set
	public int getTamanho() { return tamanho; }

	public void setTamanho(int tamanho) { this.tamanho = tamanho;}
	
}
