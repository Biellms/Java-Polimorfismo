package JavaPolimorfismo;

public class CachorroClass extends AnimalClass{
	
	// Atributos
	private String porte;
	
	// Construtor
	public CachorroClass (String nome, int idade, String especie,String raca, String porte) {
		super(nome, idade, especie, raca);
		this.porte = porte;
	}
	
	// Métodos
	@Override
	public void print() {
		System.out.print(" CACHORRO");
		System.out.print("\n Nome: "+getNome());
		System.out.print("\n Idade: "+getIdade());
		System.out.print("\n Espécie: "+getEspecie());
		System.out.print("\n Raça: "+getRaca());
		System.out.print("\n Porte: "+porte);
	}
	
	@Override
	public void som(String som) {
		System.out.print("\n O cachorro começou a LATIR!!\n "+som);
	}
	
	@Override
	public void correr(int correr) {
		System.out.print("\n O cachorro começou a CORRER!!\n Na velocidade de "+correr+"Km/h!!");
	}

	// Get e Set
	public String getPorte() {return porte; }

	public void setPorte(String porte) { this.porte = porte;}
	
}