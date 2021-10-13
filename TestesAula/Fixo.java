package JavaPolimorfismo;

public class Fixo extends Telefone{

	// Contrutor
	public Fixo() {
		super("Telefone fixo");
	}
	
	// Polimorfismo
	@Override
	public void toca(int numToques) {
		for(int i = 0; i < numToques; i++) {
			System.out.println("\n Tar�r�r�...Tar�r�r�...");
		}
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("\n Discando: "+numero);
	}
}
