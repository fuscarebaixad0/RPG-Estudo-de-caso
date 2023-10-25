package ifsc;

import java.util.ArrayList;
import java.util.Scanner;

import ifsc.npc.Companheiro;
import ifsc.npc.Criatura;
import ifsc.npc.Lobo;

public class Jogo {

	private static ArrayList<Localizacao> localizacoesMapa = new ArrayList<>();
	private static ArrayList<Transporte> transportes = new ArrayList<>();
	private static ArrayList<Interacao> interacoes = new ArrayList<>();
	private static ArrayList<Indo> deslocar = new ArrayList<>();
	private static ArrayList<Companheiro> ajudar = new ArrayList<>();
	private static ArrayList<Interacao> abordar = new ArrayList<>();
	private static ArrayList<Personagem> escolher = new ArrayList<>();
	private static ArrayList<Personagem> inventarioArmas = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int vida = 100;
		String nome;

		criarLocalizacoesMapa();
		criaTransportes();
		criarInteracao();
		criarIndo();
		criarAjuda();
		criarAbordagem();
		criarEscolha();

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
		lobo.setNome(nomeLobo);
		System.out.println("O terrivel lobo " + lobo.getNome() + " te aguarda!!!");

		System.out.println(
				"O segundo inimigo a cruzar seu caminho é uma horrenda critura, com escamas grossas e um corpo desfigurado...");

		String nomeCriatura;

		Criatura criatura = new Criatura();
		System.out.println("Escolha o nome da criatura:");
		nomeCriatura = scanner.nextLine();
		criatura.setNome(nomeCriatura);
		System.out.println("A temivel criatura " + criatura.getNome() + " te aguarda!!!");

		System.out.println(
				"Além desses inimigos, você tambem encontrará amigos. Um personagem em especifico te acompanhará em muitas aventuras no futuro");

		String nomeCompanheiro;

		Companheiro companheiro = new Companheiro();
		System.out.println("Escolha o nome do seu companheiro:");
		nomeCompanheiro = scanner.nextLine();
		companheiro.setNome(nomeCompanheiro);
		System.out.println("Seu companheiro " + companheiro.getNome() + " te aguarda!!!");

		String local;

		Localizacao localização = new Localizacao();
		System.out.println("Onde você está?");
		for (Localizacao loc : localizacoesMapa) {
			System.out.println(loc.getLocal());
		}
		local = scanner.nextLine();
		localização.setLocal(local);

		System.out.println(
				"Você está em " + localização.getLocal() + " e precisa escolher como ir até o reino de Eldor.");
		int escolha;

		while (true) {
			System.out.println("Escolha uma forma de ir até o reino de Eldor:");
			for (Transporte trans : transportes) {
				System.out.println(trans.getMeioTransporte());
			}
			escolha = scanner.nextInt();

			if (escolha == 1) {
				personagem.exausto();
				personagem.morte();
				return;
			} else if (escolha == 2 || escolha == 3) {
				personagem.chegou();

			} else {
				personagem.opinv();
				return;
			}
			break;
		}

		System.out.println(
				"Você chegou no reino de Eldor mas está perdido. Você aborda um habitante para perguntar sobre a Lãmina Eldir.");
		int abordagem;

		while (true) {
			System.out.println("Como você aborda este habitante?");
			for (Interacao inte : interacoes) {
				System.out.println(inte.getIntera());
			}
			abordagem = scanner.nextInt();

			if (abordagem == 1) {
				System.out.println("Ele se assuta, bate em você e depois te ajuda.");
				int dano = vida - 20;
				System.out.println("Você tomou 20 de dano!");
				System.out.println("Vida = " + dano);
				break;
			} else if (abordagem == 2) {
				System.out.println("Ele te ajuda normalmente.");
			} else {
				personagem.opinv();
				return;
			}
			break;
		}

		System.out.println(
				"O habitante te deu informações sobre a lâmina Eldir e você segue rumo a um vilarejo ao norte do reino chamado Trakai. Lá, você encontra uma placa com 2 destinos, Um deles é o esconderijo de um lobo e o outro uma Taverna conhecida por ser muito perigosa.");

		int destino;
		while (true) {
			System.out.println("Para onde você vai primeiro?");
			for (Indo ir : deslocar) {
				System.out.println(ir.getInd());
			}
			destino = scanner.nextInt();

			if (destino == 1) {
				System.out.println(
						"Você foi para o esconderijo de" + lobo.getNome() + " sozinho e foi derrotado pelo animal.");
				personagem.morte();
				return;
			} else if (destino == 2) {
				System.out.println(
						"Você foi para a Taverna e lá conheceu um viking chamado " + companheiro.getNome() + " ");
			} else {
				personagem.opinv();
				return;
			}

			break;
		}

		int pedidoAjuda;
		System.out.println("Você foi para a Taverna e lá conheceu um homem alto e ameaçador, um viking chamado "
				+ companheiro.getNome()
				+ "que te diz ter ouvido boatos sobre o paradeiro da lâmina eldir. Ele afirma ter ouvido habitantes discutindo sobre o esconderijo do temido lobo "
				+ lobo.getNome()
				+ ", local onde existem supostas gravuras rupestres indicando o paradeiro da lâmina. Sabendo para onde ir, você o convida para ir com você.");
		while (true) {
			System.out.println("Como você pede ajuda a " + companheiro.getNome() + "?");
			for (Companheiro ajd : ajudar) {
				System.out.println(ajd.getHelp());
			}
			pedidoAjuda = scanner.nextInt();

			if (pedidoAjuda == 1) {
				System.out.println("" + companheiro.getNome()
						+ " aceita seu pedido e vocês seguem viagem até o esconderijo de ... .");
			} else if (pedidoAjuda == 2) {
				System.out.println("" + companheiro.getNome() + " recusa seu pedido e você decide derrotar "
						+ lobo.getNome() + "sozinho.");
				personagem.morte();
				return;
			} else {
				personagem.opinv();
				return;
			}
			break;
		}
		while (true) {
			System.out.println("Como vocês vão até lá?");
			for (Transporte trans : transportes) {
				System.out.println(trans.getMeioTransporte());
			}

			int escolhaTransporteCaverna = scanner.nextInt();

			if (escolhaTransporteCaverna == 1) {
				personagem.exausto();
				personagem.morte();
				return;
			} else if (escolhaTransporteCaverna == 2 || escolhaTransporteCaverna == 3) {
				personagem.chegou();

			} else {
				personagem.opinv();
				return;
			}
			break;
		}

		System.out.println("Ao chegar no esconderijo de " + lobo.getNome() + ", você e " + companheiro.getNome()
				+ " se preparam para atacar e entram em uma caverna escura e úmida.");
		System.out.println("Lá dentro, " + lobo.getNome() + " parece assustado e ataca.");

		System.out.println(" Você e " + companheiro.getNome() + " lutam com tudo o que tem e vencem a batalha!!!");
		System.out.println("Sem " + lobo.getNome()
				+ " protegendo a caverna, não demorou muito para que vocês encontrassem as gravuras, que diziam que a lâmina estava dentro de um grande castelo localizado no topo da maior colina em todo o reino, que ficava a alguns dias de distância.");
		System.out.println(
				"Determinados a completar a missão, vocês deixam a caverna e continuam a jornada em direção à colina.");

		while (true) {
			System.out.println("Como vocês vão até lá?");
			for (Transporte trans : transportes) {
				System.out.println(trans.getMeioTransporte());
			}

			int escolhaTransporteColina = scanner.nextInt();

			if (escolhaTransporteColina == 1) {
				personagem.exausto();
				personagem.morte();
				return;
			} else if (escolhaTransporteColina == 2) {
				System.out.println("A carruagem cai de uma montanha alta e estreita.");
				personagem.morte();
				return;
			} else if (escolhaTransporteColina == 3) {
				personagem.chegou();
			} else {
				personagem.opinv();
				return;
			}
			break;
		}

		System.out.println("Após 4 dias a cavalo, você e " + companheiro.getNome() + "chegam em seu destino final.");
		System.out.println("No topo, avistam um grande castelo antigo, rodeado por guardas, criaturas chamadas de "
				+ criatura.getNome() + " que protegem o castelo e guardam a lâmina.");
		System.out.println(
				"" + companheiro.getNome() + "quer entrar atacando, já você prefere uma abordagem mais sutil.");

		while (true) {
			System.out.println("Como vocês invadem o castelo?");
			for (Interacao abr : abordar) {
				System.out.println(abr.getAborda());
			}
			int abordagemCastelo = scanner.nextInt();

			if (abordagemCastelo == 1) {
				System.out.println("As " + criatura.getNome() + " são muitas para você e. " + companheiro.getNome());
				personagem.morte();
				return;
			} else if (abordagemCastelo == 2) {
				System.out.println(
						"Vocês decidem se infiltrar no castelo, evitando os olhares dos draugrs o máximo possível.");
			}
			break;
		}
		System.out
				.println("À medida que avançam, encontram salas escuras e passagens secretas no interior do castelo.");
		System.out.println(
				"Após muitas horas de exploração, vocês chegam à câmara onde a lâmina mágica está guardada. Para sua surpesa a sala não tem guardas.");
		System.out.println("A lâmina repousa em um pedestal de pedra, brilhando com uma aura de poder místico.");
		System.out.println("Vocês a pegam com muito cuidado e saem do castelo o mais rápido que podem da câmara.");

		System.out.println("O feixes de luz que a lâmina emite atraem a atenção de duas " + criatura.getNome()
				+ ", obrigando vocês a lutar.");
		while (true) {
			System.out.println("Que arma você usa para lutar?");
			for (Personagem esa : escolher) {
				System.out.println(esa.getEscolhaArma());
			}

			int armaEscolhida = scanner.nextInt();

			if (armaEscolhida == 1) {
				System.out.println("As " + criatura.getNome()
						+ " são derrotados sem muito esforço e vocês saem do castelo em segurança.");
			} else if (armaEscolhida == 2) {
				System.out.println("As flechas não são fortes o suficiente para atravessar a pele dos inimigos.");
				personagem.morte();
				return;
			} else {
				personagem.opinv();
				return;
			}
			break;
		}
		// Adicionar final
		System.out.println(
				"Depois de tantos anos, a Lâmina Eldir foi recuperada, trazendo luz e paz de volta ao reino de Eldor.");
		System.out.println("FIM DO JOGO");
	}

	public static void criarLocalizacoesMapa() {
		Localizacao local1 = new Localizacao();
		local1.setLocal("1 - Vale dos Sussurros");

		Localizacao local2 = new Localizacao();
		local2.setLocal("2 - Bosque da Perdição");

		Localizacao local3 = new Localizacao();
		local3.setLocal("3 - Montanha Nebulosa");

		localizacoesMapa.add(local1);
		localizacoesMapa.add(local2);
		localizacoesMapa.add(local3);
	}

	public static void criaTransportes() {

		Transporte transporte1 = new Transporte();
		transporte1.setMeioTransporte("1 - A pé");

		Transporte transporte2 = new Transporte();
		transporte2.setMeioTransporte("2 - De carruagem");

		Transporte transporte3 = new Transporte();
		transporte3.setMeioTransporte("3 - A cavalo");

		transportes.add(transporte1);
		transportes.add(transporte2);
		transportes.add(transporte3);
	}

	public static void criarInteracao() {
		Interacao inter1 = new Interacao();
		inter1.setIntera("1 - Cutucando ele.");

		Interacao inter2 = new Interacao();
		inter2.setIntera("2 - O chamando em voz alta");

		interacoes.add(inter1);
		interacoes.add(inter2);

	}

	public static void criarIndo() {
		Indo ir1 = new Indo();
		ir1.setInd("1 - Esconderijo do lobo.");

		Indo ir2 = new Indo();
		ir2.setInd("2 - Taverna dos Reclusos.");

		deslocar.add(ir1);
		deslocar.add(ir2);

	}

	public static void criarAjuda() {
		Companheiro aj1 = new Companheiro();
		aj1.setHelp("1 - Oferecendo dinheiro.");

		Companheiro aj2 = new Companheiro();
		aj2.setHelp("2 - Implorando.");

		ajudar.add(aj1);
		ajudar.add(aj2);

	}

	public static void criarAbordagem() {
		Interacao ab1 = new Interacao();
		ab1.setAborda("1 - Atacando.");

		Interacao ab2 = new Interacao();
		ab2.setAborda("2 - Escondidos.");

		abordar.add(ab1);
		abordar.add(ab2);

	}

	public static void criarEscolha() {
		Personagem ea1 = new Personagem();
		ea1.setEscolhaArma("1 - Golpe de Espada.");

		Personagem ea2 = new Personagem();
		ea2.setEscolhaArma("2 - Arco e Flecha.");

		escolher.add(ea1);
		escolher.add(ea2);

	}
	
}

