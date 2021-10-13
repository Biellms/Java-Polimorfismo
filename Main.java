package JavaPolimorfismo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		int op;
		
		// Criando Objetos
		
		CachorroClass dog = new CachorroClass("Bill",1,"Canino","Gonden Retriever","Grande");
		CavaloClass horse = new CavaloClass("Pé de Pano",3,"Equino","Puro-sangue inglês","Preto");
		PreguiçaClass tired = new PreguiçaClass("Gabriel",2,"Bradypus Variegatus","preguiça-anã-de-três-dedos",70);
		AnimalClass animal = null;
		
		do {	// Menu de Opções
		System.out.println("\n -----------------------------");
		System.out.printf("\n Escolha uma opção");	
		System.out.printf("\n 1) CACHORRO");	
		System.out.printf("\n 2) CAVALO");
		System.out.printf("\n 3) BICHO-PREGUIÇA");
		System.out.printf("\n Opção: "); op = ler.nextInt();
		System.out.println("\n -----------------------------");
		
		switch (op) {
		
		case 1:
		animal = dog; 
		dog.print();	
		System.out.print("\n -----------------------------");	// Exição de Opções
		System.out.print("\n 1) Latir");
		System.out.print("\n 2) Correr");
		System.out.print("\n Opção: "); op = ler.nextInt();
		while (op >=1 || op <= 2) {	// Exibe Métodos
			if (op == 1) { 
			System.out.print("\n Qual SOM seu CACHORRO faz? ");
			String som = ler.next(); dog.som(som);	// Lê o som digitado
				break; }
			if (op == 2) { System.out.print("\n Qual a VELOCIDADE do seu CACHORRO? "); 
			int correr = ler.nextInt(); dog.correr(correr);	// Lê a velocidade digitada
				break; }
		}
		break;
		
		case 2:
		animal = horse;
		horse.print();
		System.out.print("\n -----------------------------");	// Exição de Opções
		System.out.print("\n 1) Rinchar");
		System.out.print("\n 2) Correr");
		System.out.print("\n Opção: "); op = ler.nextInt();
		while (op >=1 || op <= 2) {	// Exibe Métodos
			if (op == 1) { System.out.print("\n Qual SOM o seu CAVALO faz? ");
			String som = ler.next(); horse.som(som);	// Lê o som digitado
				break; } 
			if (op == 2) { System.out.print("\n Qual a VELOCIDADE do seu CAVALO? ");
			int correr = ler.nextInt(); horse.correr(correr);	// Lê a velocidade digitada
				break; }
		}
		break;
		
		case 3: 
		animal = tired;
		tired.print();
		System.out.print("\n -----------------------------");	// Exição de Opções
		System.out.print("\n 1) Emitir Som");
		System.out.print("\n 2) Correr");
		System.out.print("\n 3) Subir Árvore");
		System.out.print("\n Opção: "); op = ler.nextInt();
		while (op >=1 || op <= 3) {	// Exibe Métodos
			if (op == 1) { System.out.print("\n Qual SOM o seu CAVALO faz? ");
			String som = ler.next(); tired.som(som);	// Lê o som digitado
				break; }
			if (op == 2) { int correr = 0; tired.correr(correr); break;}
			if (op == 3) { tired.subir(); break; }
		}
		break;
		
		default: System.out.println("\n OPÇÃO INVALIDA"); break;
			}
		} while (op != 0);
	}
}