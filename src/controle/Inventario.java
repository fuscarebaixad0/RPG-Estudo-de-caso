package controle;

import java.util.Scanner;
import modelo.ArmaDAO;
import modelo.IArmaDAO;
import modelo.Arma;

public class Inventario {
    public static ArmaDAO armaDAO = new IArmaDAO();

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
                    armaDAO.adicionar(novaArma);
                    break;

                case 2:
                    armaDAO.visualizar();
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
                    armaDAO.editar(indiceEditar - 1, novaArma);
                    break;

                case 3:
                    armaDAO.visualizar();
                    System.out.print("Digite o número da arma que deseja excluir: ");
                    int indiceExcluir = scanner.nextInt();
                    scanner.nextLine();

                    armaDAO.excluir(indiceExcluir - 1);
                    break;

                case 4:
                    armaDAO.visualizar();
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