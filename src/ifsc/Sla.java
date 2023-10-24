package ifsc;

import java.util.Scanner;

public class Sla {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int vida = 100;
		String nome;

		Personagem personagem = new Personagem();
		System.out.println("Digite o nome do seu personagem:");
		nome = scanner.nextLine();
		personagem.setNome(nome);

		System.out.println("Olá, " + personagem.getNome()
				+ "! Você encontrará alguns inimigos pelo caminho, ecolha o nome deles agora.");
		System.out.println(
				"Um dos primeiros inimigos que você enfrentará é um temido lobo, com garras e dentes enorme...");

		String nomeLobo;

		Lobo lobo = new Lobo();
		System.out.println("Escolha o nome do lobo:");
		nomeLobo = scanner.nextLine();
		lobo.setNomeLobo(nomeLobo);
		System.out.println("O terrivel lobo " + lobo.getNomeLobo() + " te aguarda!!!");

		System.out.println(
				"O segundo inimigo a cruzar seu caminho é uma horrenda critura, com escamas grossas e um corpo desfigurado...");

		String nomeCriatura;

		Criatura criatura = new Criatura();
		System.out.println("Escolha o nome da criatura:");
		nomeCriatura = scanner.nextLine();
		criatura.setNomeCriatura(nomeCriatura);
		System.out.println("A temivel criatura " + criatura.getNomeCriatura() + " te aguarda!!!");

		System.out.println(
				"Além desses inimigos, você tambem encontrará amigos. Um personagem em especifico te acompanhará em muitas aventuras no futuro");

		String nomeCompanheiro;

		Companheiro companheiro = new Companheiro();
		System.out.println("Escolha o nome do seu companheiro:");
		nomeCompanheiro = scanner.nextLine();
		companheiro.setNomeCompanheiro(nomeCompanheiro);
		System.out.println("Seu companheiro " + companheiro.getNomeCompanheiro() + " te aguarda!!!");

		String local;

		Localização localização = new Localização();
		System.out.println("Onde você está?");
		local = scanner.nextLine();
		localização.setLocal(local);
		System.out.println(
				"Você está em " + localização.getLocal() + " e precisa escolher como ir até o reino de Eldor.");
		int escolha;

		while (true) {
			System.out.println("Escolha uma forma de ir até o reino de Eldor:");
			System.out.println("1 - A pé");
			System.out.println("2 - De carruagem");
			System.out.println("3 - A cavalo");
			escolha = scanner.nextInt();

			switch (escolha) {
			case 1:
				System.out.println("Você ficou exausto e não tinha muitos suprimentos.");
				personagem.morte();
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
				"Você chegou no reino de Eldor mas está perdido. Você aborda um habitante para perguntar sobre a Lãmina Eldir.");
		int abordagem;

		while (true) {
			System.out.println("Como você aborda este habitante?");
			System.out.println("1 - Cutucando");
			System.out.println("2 - Chamando em voz alta");
			abordagem = scanner.nextInt();

			switch (abordagem) {
			case 1:
				System.out.println("Ele se assuta, bate em você e depois te ajuda.");
				int dano = vida - 20;
				System.out.println("Você tomou 20 de dano!");
				System.out.println("Vida =" + dano);
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
				"O habitante te deu informações sobre a lâmina Eldir e você segue rumo a um vilarejo ao norte do reino chamado Trakai. Lá, você encontra uma placa com 2 destinos, Um deles é o esconderijo de um lobo e o outro uma Taverna conhecida por ser muito perigosa.");

		int destino;
		while (true) {
			System.out.println("Para onde você vai primeiro?");
			System.out.println("1 - Esconderijo do lobo " + lobo.getNomeLobo() + ".");
			System.out.println("2 - Taverna dos Reclusos");
			destino = scanner.nextInt();

			switch (destino) {
			case 1:
				System.out.println("Você foi para o esconderijo de" + lobo.getNomeLobo()
						+ " sozinho e foi derrotado pelo animal.");
				personagem.morte();
				return;
			case 2:
				System.out.println("Você foi para a Taverna e lá conheceu um viking chamado "
						+ companheiro.getNomeCompanheiro() + " ");
				break;
			default:
				System.out.println("Opção inválida. Escolha novamente.");
				continue;
			}

			break;
		}

		int pedidoAjuda;
		System.out.println("Você foi para a Taverna e lá conheceu um homem alto e ameaçador, um viking chamado "
				+ companheiro.getNomeCompanheiro()
				+ "que te diz ter ouvido boatos sobre o paradeiro da lâmina eldir. Ele afirma ter ouvido habitantes discutindo sobre o esconderijo do temido lobo "
				+ lobo.getNomeLobo()
				+ ", local onde existem supostas gravuras rupestres indicando o paradeiro da lâmina. Sabendo para onde ir, você o convida para ir com você.");
		while (true) {
			System.out.println("Como você pede ajuda a " + companheiro.getNomeCompanheiro() + "?");
			System.out.println("1 - Oferecendo dinheiro em troca");
			System.out.println("2 - Implorando");
			pedidoAjuda = scanner.nextInt();

			switch (pedidoAjuda) {
			case 1:
				System.out.println("" + companheiro.getNomeCompanheiro()
						+ " aceita seu pedido e vocês seguem viagem até o esconderijo de ... .");
				break;
			case 2:
				System.out.println("" + companheiro.getNomeCompanheiro()
						+ " recusa seu pedido e você decide derrotar ... sozinho. (VOCÊ MORRE)");
				return;
			default:
				System.out.println("Opção inválida. Escolha novamente.");
				continue;
			}

			break;
		}
		System.out.println("Como vocês vão até lá?");
		System.out.println("1 - A pé");
		System.out.println("2 - De carruagem");
		System.out.println("3 - A cavalo");

		int escolhaTransporteCaverna = scanner.nextInt();

		switch (escolhaTransporteCaverna) {
		case 1:
			System.out.println("Vocês ficam exaustos e não tem muitos suprimentos");
			personagem.morte();
			return;
		case 2:
		case 3:
			System.out.println("Vocês chegam sem nenhum problema.");
			break;
		default:
			System.out.println("Escolha inválida. Tente novamente.");
			return;
		}
		System.out.println(
				"Ao chegar no esconderijo de " + lobo.getNomeLobo() + ", você e " + companheiro.getNomeCompanheiro()
						+ " se preparam para atacar e entram em uma caverna escura e úmida.");
		System.out.println("Lá dentro, " + lobo.getNomeLobo()
				+ " parece assustado e tenta atacá-los com suas garras enormes e dentes afiados.");

		System.out.println(
				"Ao chegar no esconderijo, ambos se preparam para atacar e entram em uma caverna escura e úmida, onde "
						+ lobo.getNomeLobo() + " supostamente estaria. Lá dentro, " + companheiro.getNomeCompanheiro()
						+ " parece assustado e tenta atacá-los com suas garras enormes e dentes afiados. Você e ... lutam com tudo o que tem e vencem a batalha!!!");
		System.out.println("Sem " + lobo.getNomeLobo()
				+ " protegendo a caverna, não demorou muito para que vocês encontrassem as gravuras, que diziam que a lâmina estava dentro de um grande castelo localizado no topo da maior colina em todo o reino, que ficava a alguns dias de distância.");
		System.out.println(
				"Determinados a completar a missão, vocês deixam a caverna e continuam a jornada em direção à colina.");

		System.out.println("Como vocês vão até lá?");
		System.out.println("1 - A pé");
		System.out.println("2 - De carruagem");
		System.out.println("3 - A canoa");

		int escolhaTransporteColina = scanner.nextInt();

		switch (escolhaTransporteColina) {
		case 1:
			System.out.println("Vocês morrem de exaustão e por falta de suprimentos.");
			personagem.morte();
			return;
		case 2:
			System.out.println("A carruagem cai de uma montanha alta e estreita.");
			personagem.morte();
			return;
		case 3:
			System.out.println("Vocês chegam sem nenhum problema.");
			break;
		default:
			System.out.println("Escolha inválida. Tente novamente.");
			return;
		}

		System.out.println(
				"Após 4 dias a canoa, você e " + companheiro.getNomeCompanheiro() + "chegam em seu destino final.");
		System.out.println("No topo, avistam um grande castelo antigo, rodeado por guardas, criaturas chamadas de "
				+ criatura.getNomeCriatura() + " que protegem o castelo e guardam a lâmina.");
		System.out.println("" + companheiro.getNomeCompanheiro()
				+ "quer entrar atacando, já você prefere uma abordagem mais sutil.");
		System.out.println("Como vocês invadem o castelo?");
		System.out.println("1 - Atacando");
		System.out.println("2 - De forma sutil");

		int abordagemCastelo = scanner.nextInt();

		switch (abordagemCastelo) {
		case 1:
			System.out.println("As " + criatura.getNomeCriatura() + " são muitos para você e ... . (VOCÊ MORRE)");
			personagem.morte();
			return;
		case 2:
			System.out.println(
					"Vocês decidem se infiltrar no castelo, evitando os olhares dos draugrs o máximo possível.");
			System.out.println(
					"À medida que avançam, encontram salas escuras e passagens secretas no interior do castelo. Muitas desses cômodos estavam trancados ou com maçanetas quebradas, então não foi possível explorar muito.");
			System.out.println(
					"Finalmente, após muitas horas de exploração, vocês chegam à câmara onde a lâmina mágica está guardada.");
			System.out.println("Ela repousa em um pedestal de pedra, brilhando com uma aura de poder místico.");
			System.out.println("Vocês saem do castelo o mais rápido que puder, sem olhar para trás.");

			System.out.println("O feixes de luz que a lâmina solta atraem a atenção de duas "
					+ criatura.getNomeCriatura() + ", obrigados vocês a lutar.");
			System.out.println("Que arma você usa para lutar?");
			System.out.println("1 - Espada");
			System.out.println("2 - Arco e flecha");

			int armaEscolhida = scanner.nextInt();

			switch (armaEscolhida) {
			case 1:
				System.out.println("As " + criatura.getNomeCriatura()
						+ " são derrotados sem muito esforço e vocês saem do castelo em segurança.");
				break;
			case 2:
				System.out.println("As flechas não são fortes o suficiente para atravessar a pele dos inimigos.");
				personagem.morte();
				return;
			default:
				System.out.println("Escolha inválida. Tente novamente.");
				return;
			}
			// Adicionar final
			System.out.println(
					"Depois de tantos anos, a Lâmina Eldir foi recuperada, trazendo luz e paz de volta ao reino de Eldor.");
			System.out.println("FIM DO JOGO");
			break;
		default:
			System.out.println("Escolha inválida. Vocês são descobertos pelos draugrs. (VOCÊ MORRE)");
			return;
		}
	}
}
