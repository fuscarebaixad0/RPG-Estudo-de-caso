package controle;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Arma;

public class Inventario {
	private static ArrayList<Arma> inventario = new ArrayList<>();
	

		public void adicionarArma(Arma arma) {
			inventario.add(arma);
			System.out.println("Nova arma cadastrada!");
		}

		public void editarArma(int indice, Arma novaArma) {
			if (indice >= 0 && indice < inventario.size()) {
				inventario.set(indice, novaArma);
				System.out.println("Arma editada!");
			} else {
				System.out.println("Índice inválido.");
			}
		}

		public void excluirArma(int indice) {
			if (indice >= 0 && indice < inventario.size()) {
				inventario.remove(indice);
				System.out.println("Arma excluída!");
			} else {
				System.out.println("Índice inválido.");
			}
		}

		public void visualizarArma() {
			if (inventario.isEmpty()) {
				System.out.println("Seu inventário está vazio.");
			} else {
				for (int i = 0; i < inventario.size(); i++) {
					System.out.println("Arma #" + (i + 1) + ":\n" + inventario.get(i));

				}
			}
		}

		public static void main(String[] args) {
			Inventario inventario= new Inventario();
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
					inventario.adicionarArma(novaArma);
					break;

				case 2:
					inventario.visualizarArma();
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
					inventario.editarArma(indiceEditar - 1, novaArma);
					break;

				case 3:
					inventario.visualizarArma();
					System.out.print("Digite o número da arma que deseja excluir: ");
					int indiceExcluir = scanner.nextInt();
					scanner.nextLine();

					inventario.excluirArma(indiceExcluir - 1);
					break;

				case 4:
					inventario.visualizarArma();
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
}
