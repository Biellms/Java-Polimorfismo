package JavaPolimorfismo;

public class Public extends Telefone {
	
	public Public() {
		super("Orelhão");
	}
	
	// Polimorfismo
	@Override
	public void toca(int numToques) {
		for(int i = 0; i < numToques; i++) {
			System.out.println("\n Tem um pobre ligando pra mim...");
		}
	}
		
	@Override
	public void disca(String numero) {
		if(numero.charAt(0) == '9' || numero.charAt(0) == '8') { // .charAT() Função para pegar o primeiro Char
			System.out.println("\n Este Telefone não liga para celular!");
		} else {
			System.out.println("\n Discando: "+numero);
		}
	}
}
