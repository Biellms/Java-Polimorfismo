package JavaPolimorfismo;

public class Celular extends Telefone{

	// Construtor
	public Celular() {
		super("Nokia Tijol�o");
	}
	
	// Polimorfismo
	@Override	// Indica que � um M�TODO POLIFORMICO (Sobrescrita de m�todos){
		public void toca(int numToques) {
			for(int i = 0; i < numToques; i++) {
				System.out.println("\n Eletrovision... Eletrovision...");
			}
		}
	
	@Override
	public void disca(String numero) {
		System.out.println("\n Discando: "+numero);
	}
	
}
