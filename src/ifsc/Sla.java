package ifsc;

import java.util.Scanner;

public class Sla {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int vida=100;
		String nome;

		Personagem personagem = new Personagem();
		System.out.println("Digite o nome do seu personagem:");
		nome = scanner.nextLine();
		personagem.setNome(nome);

		System.out.println("Olá, " + personagem.getNome() + "! Você está com a vida cheia!");
		
		System.out.println("Você encontrará alguns inimigos pelo caminho, ecolha o nome deles agora.");
		System.out.println("Um dos primeiros inimigos que você enfrentará é um temido lobo, com garras e dentes enorme...");
	
		String nomeLobo;

		Lobo lobo = new Lobo();
		System.out.println("Escolha o nome do lobo:");
		nomeLobo = scanner.nextLine();
		lobo.setNomeLobo(nomeLobo);
		System.out.println(
				"O terrivel lobo " + lobo.getNomeLobo() + " te aguarda!!!");
		
		System.out.println("O segundo inimigo a cruzar seu caminho é uma horrenda critura, com escamas grossas e um corpo desfigurado...");
		
		String nomeCriatura;

		Criatura criatura = new Criatura();
		System.out.println("Escolha o nome da criatura:");
		nomeCriatura = scanner.nextLine();
		criatura.setNomeCriatura(nomeCriatura);
		System.out.println(
				"O temivel criatura " + criatura.getNomeCriatura() + " te aguarda!!!");
		
		System.out.println("Além desses inimigos, você tambem encontrará amigos. Um personagem em especifico te acompanhará em muitas aventuras no futuro");
		
		String nomeCompanheiro;

		Companheiro companheiro = new Companheiro();
		System.out.println("Escolha o nome do seu companheiro:");
		nomeCompanheiro = scanner.nextLine();
		companheiro.setNomeCompanheiro(nomeCompanheiro);
		System.out.println("Seu companheiro "+ companheiro.getNomeCompanheiro() + " te aguarda!!!");
		
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
				"Você chegou no reino de Eldor e está perdido. Você aborda um habitante para perguntar sobre a Lãmina Eldir.");
		int abordagem;

		while (true) {
			System.out.println("Como você aborda este habitante?");
			System.out.println("1 - Cutucando");
			System.out.println("2 - Chamando em voz alta");
			abordagem = scanner.nextInt();

			switch (abordagem) {
			case 1:
				System.out.println("Ele se assuta, bate em você e depois te ajuda."); 
				int dano= vida-10;
				System.out.println("Você tomou 10 de dano!");
				System.out.println("Vida ="+ dano);
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
				System.out.println(
						"Você foi para o esconderijo de" + lobo.getNomeLobo() +" sozinho e foi derrotado pelo animal.");
				String morte;
				return;
			case 2:
				System.out.println("Você foi para a Taverna e lá conheceu um viking chamado ... .");//Adicionar nome companheiro
				break;
			default:
				System.out.println("Opção inválida. Escolha novamente.");
				continue;
			}

			break;
		}

		int pedidoAjuda;
		System.out.println("Você foi para a Taverna e lá conheceu um homem alto e ameaçador, um viking chamado ... que te diz ter ouvido boatos sobre o paradeiro da lâmina eldir. Ele afirma ter ouvido habitantes discutindo sobre o esconderijo do temido lobo ..., local onde existem supostas gravuras rupestres indicando o paradeiro da lâmina. Sabendo para onde ir, você o convida para ir com você.");
		while (true) { //Adicionar nome companheiro e nome lobo
			System.out.println("Como você pede ajuda a ...?");//Adicionar nome companheiro
			System.out.println("1 - Oferecendo dinheiro em troca");
			System.out.println("2 - Implorando");
			pedidoAjuda = scanner.nextInt();

			switch (pedidoAjuda) {
			case 1:
				System.out.println("... aceita seu pedido e vocês seguem viagem até o esconderijo de ... ."); //Adicionar nome companheiro e nome lobo
				break;
			case 2:
				System.out.println("... recusa seu pedido e você decide derrotar ... sozinho. (VOCÊ MORRE)");//Adicionar nome companheiro e nome lobo
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
			System.out.println("Vocês morrem de exaustão e por falta de suprimentos. (VOCÊ MORRE)");//Mudar morte
			return;
		case 2:
			System.out.println("Vocês chgam sem nenhum problema. (VOCÊ MORRE)");
			return;
		case 3:
			System.out.println("Vocês chegam sem nenhum problema.");
			break;
		default:
			System.out.println("Escolha inválida. Você nunca chega até ... . (VOCÊ MORRE)");//Adicionar nome lobo
			return;
		}
		System.out.println(
				"Ao chegar no esconderijo de ..., você e ... se preparam para atacar e entram em uma caverna escura e úmida.");//Adicionar nome companheiro e nome lobo
		System.out.println(
				"Lá dentro, ... parece assustado e tenta atacá-los com suas garras enormes e dentes afiados.");//Adicionar nome lobo
		
		System.out.println("Ao chegar no esconderijo, ambos se preparam para atacar e entram em uma caverna escura e úmida, onde ... supostamente estaria. Lá dentro, ... parece assustado e tenta atacá-los com suas garras enormes e dentes afiados. Você e ... lutam com tudo o que tem e vencem a batalha!!!");//Adicionar nome companheiro e nome lobo
		System.out.println("Sem ... protegendo a caverna, não demorou muito para que vocês encontrassem as gravuras, que diziam que a lâmina estava dentro de um grande castelo localizado no topo da maior colina em todo o reino, que ficava a alguns dias de distância.");//Adicionar nome lobo
		System.out.println("Determinados a completar a missão, vocês deixam a caverna e continuam a jornada em direção à colina.");
		
		System.out.println("Como vocês vão até lá?");
		System.out.println("1 - A pé");
		System.out.println("2 - De carruagem");
		System.out.println("3 - A canoa");

		int escolhaTransporteColina = scanner.nextInt();

		switch (escolhaTransporteColina) {
		case 1:
			System.out.println("Vocês morrem de exaustão e por falta de suprimentos. (VOCÊ MORRE)");
			return;
		case 2:
			System.out.println("A carruagem cai de uma montanha alta e estreita. (VOCÊ MORRE)");
			return;
		case 3:
			System.out.println("Vocês chegam sem nenhum problema.");
			break;
		default:
			System.out.println("Escolha inválida. Você nunca chega até ... . (VOCÊ MORRE)");//Adicionar nome lobo
			return;
		}
		
		System.out.println("Após 4 dias a canoa, você e ... chegam em seu destino final.");//Adicionar nome companheiro
		System.out.println(
				"No topo, avistam um grande castelo antigo, rodeado por guardas, criaturas chamadas de ... que protegem o castelo e guardam a lâmina."); //Adicionar nome criaturas
		System.out.println("... quer entrar atacando, já você prefere uma abordagem mais sutil.");//Adicionar nome companheiro 
		System.out.println("Como vocês invadem o castelo?");
		System.out.println("1 - Atacando");
		System.out.println("2 - De forma sutil");

		int abordagemCastelo = scanner.nextInt();

		switch (abordagemCastelo) {
		case 1:
			System.out.println("Os ... são muitos para você e ... . (VOCÊ MORRE)");
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

			System.out.println(
					"O feixes de luz que a lâmina solta atraem a atenção de dois ..., obrigados vocês a lutar.");
			System.out.println("Que arma você usa para lutar?");
			System.out.println("1 - Espada");
			System.out.println("2 - Arco e flecha");

			int armaEscolhida = scanner.nextInt();

			switch (armaEscolhida) {
			case 1:
				System.out.println("Os ... são derrotados sem muito esforço e vocês saem do castelo em segurança.");
				break;
			case 2:
				System.out.println(
						"As flechas não são fortes o suficiente para atravessar a pele dos inimigos. (VOCÊ MORRE)");
				return;
			default:
				System.out.println("Escolha inválida. Você é derrotado pelos ... . (VOCÊ MORRE)");
				return;
			}
			//Adicionar final
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
