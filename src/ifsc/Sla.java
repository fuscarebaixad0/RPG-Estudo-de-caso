package ifsc;

import java.util.Scanner;

public class Sla {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nomePersonagem;

		System.out.println("Digite o nome do seu personagem:");
		nomePersonagem = scanner.nextLine();

		System.out.println("Olá, " + nomePersonagem
				+ "! Você está no Bosque dos Sussurros e precisa escolher como ir até o reino de Eldor.");
		int escolha;

		while (true) {
			System.out.println("Escolha uma forma de ir até o reino de Eldor:");
			System.out.println("1 - A pé");
			System.out.println("2 - De carruagem");
			System.out.println("3 - A cavalo");
			escolha = scanner.nextInt();

			switch (escolha) {
			case 1:
				System.out.println("Você morreu de exaustão e por falta de suprimentos.");
				return;
			case 2:
			case 3:
				System.out.println("Você chegou ao reino tranquilamente.");
				break;
			default:
				System.out.println("Opção inválida. Escolha novamente.");
				continue;
			}

			break;
		}

		System.out.println(
				"\nVocê chegou no reino de Eldor e está perdido. Você aborda um habitante para perguntar sobre a LÂMINA ELDIR.");
		int abordagem;

		while (true) {
			System.out.println("\nComo você aborda este habitante?");
			System.out.println("1 - Cutucando");
			System.out.println("2 - Chamando em voz alta");
			abordagem = scanner.nextInt();

			switch (abordagem) {
			case 1:
				System.out.println("Ele bate em você e depois te ajuda.");
				break;
			case 2:
				System.out.println("Ele te ajuda normalmente.");
				break;
			default:
				System.out.println("Opção inválida. Escolha novamente.");
				continue;
			}

			break;
		}

		System.out.println(
				"\nO habitante te deu informações sobre a lâmina Eldir e você segue rumo a um vilarejo ao norte do reino chamado Trakai.");
		System.out.println("Lá, você encontra uma placa com 2 destinos e precisa decidir para onde vai primeiro.");

		int destino;
		while (true) {
			System.out.println("\nPara onde você vai primeiro?");
			System.out.println("1 - Esconderijo do lobo Fenrir");
			System.out.println("2 - Taverna dos Reclusos");
			destino = scanner.nextInt();

			switch (destino) {
			case 1:
				System.out.println(
						"Você foi para o esconderijo de Fenrir sozinho e foi derrotado pelo animal. (VOCÊ MORRE)");
				return;
			case 2:
				System.out.println("Você foi para a Taverna e lá conheceu um viking chamado Ivar.");
				break;
			default:
				System.out.println("Opção inválida. Escolha novamente.");
				continue;
			}

			break;
		}

		int pedidoAjuda;
		System.out.println("Ivar ouviu boatos sobre o paradeiro da lâmina Eldir e concorda em te ajudar.");
		while (true) {
			System.out.println("\nComo você pede ajuda a Ivar?");
			System.out.println("1 - Oferecendo dinheiro em troca");
			System.out.println("2 - Implorando");
			pedidoAjuda = scanner.nextInt();

			switch (pedidoAjuda) {
			case 1:
				System.out.println("Ivar aceita seu pedido e vocês seguem viagem até o esconderijo de Fenrir.");
				break;
			case 2:
				System.out.println("Ivar recusa seu pedido, e você decide derrotar Fenrir sozinho. (VOCÊ MORRE)");
				return;
			default:
				System.out.println("Opção inválida. Escolha novamente.");
				continue;
			}

			break;
		}

		System.out.println(
				"Ao chegar no esconderijo de Fenrir, você e Ivar se preparam para atacar e entram em uma caverna escura e úmida.");

		// Continuar a implementação do jogo...
	}
}
