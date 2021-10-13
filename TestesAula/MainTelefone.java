package JavaPolimorfismo;

public class MainTelefone {

	public static void main(String[] args) {
		
		// Objetos
		Celular cel = new Celular();
		Fixo fixo = new Fixo();
		Public pub = new Public();
		Telefone tel = null;	// Classe Abstrata não pode ser instânciada
		
		// Função para gerar numero randomico
		int n = (int) (Math.random()*3.0);
		int t = (int) (Math.random()*10.0);
		
		System.out.println("\n RANDOM: "+n);
		
		switch(n) {
		
		case 0: tel = cel; break;
		case 1: tel = fixo; break;
		case 2: tel = pub; break;
		default: System.out.println("\n Erro Inesperado!!");
		}	
	
		if (tel!=null) {
			tel.disca("959775765");
			tel.toca(t);
		}
	}
}
