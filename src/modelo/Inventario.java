package visao;

import java.util.Scanner;

import controle.ArmaDAO;
import modelo.Arma;

public class Inventario {
	private static ArmaDAO armaDAO = ArmaDAO.getInstancia();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Adicionar arma");
			System.out.println("2. Editar arma");
			System.out.println("3. Excluir arma");
			System.out.println("4. Visualizar armas");
			System.out.println("5. Encerrar programa");
			System.out.print("Escolha uma opção: ");

			int escolha = scanner.nextInt();
			scanner.nextLine();

			switch (escolha) {
			case 1:
				System.out.print("Nome: ");
				String nome = scanner.nextLine();
				System.out.print("Modelo: ");
				String modelo = scanner.nextLine();
				System.out.print("Tamanho: ");
				String tamanho = scanner.nextLine();
				System.out.print("Força: ");
				String forca = scanner.nextLine();

				Arma novaArma = new Arma(nome, modelo, tamanho, forca);
				boolean retorno = armaDAO.adicionarArma(novaArma);
				if (retorno == true) {
					System.out.println("Arma adicionada com sucesso!");
				} else {
					System.out.println("Arma não foi adicionada.");
				}
				break;

			case 2:
				visualizarArmas();
				System.out.print("Digite o número da arma que deseja editar: ");
				int indiceEditar = scanner.nextInt();
				scanner.nextLine();

				System.out.print("Alterar nome: ");
				nome = scanner.nextLine();
				System.out.print("Alterar modelo: ");
				modelo = scanner.nextLine();
				System.out.print("Alterar tamanho: ");
				tamanho = scanner.nextLine();
				System.out.print("Alterar força: ");
				forca = scanner.nextLine();

				novaArma = new Arma(nome, modelo, tamanho, forca);
				armaDAO.editarArma(indiceEditar - 1, novaArma);
				break;

			case 3:
				visualizarArmas();
				System.out.print("Digite o número da arma que deseja excluir: ");
				int indiceExcluir = scanner.nextInt();
				scanner.nextLine();

				armaDAO.excluirArma(indiceExcluir - 1);
				break;

			case 4:
				visualizarArmas();
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;

			case 5:
				System.out.println("Encerrando o programa.");
				scanner.close();
				System.exit(0);

			default:
				System.out.println("Opção inválida! Tente novamente.");
				break;
			}
		}
	}

	public static void visualizarArmas() {
		for (Arma arma : armaDAO.visualizarArmas()) {
			System.out.println(arma.getArma());
		}
	}
}

