package JavaPolimorfismo;

public class Public extends Telefone {
	
	public Public() {
		super("Orelh�o");
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
		if(numero.charAt(0) == '9' || numero.charAt(0) == '8') { // .charAT() Fun��o para pegar o primeiro Char
			System.out.println("\n Este Telefone n�o liga para celular!");
		} else {
			System.out.println("\n Discando: "+numero);
		}
	}
}
