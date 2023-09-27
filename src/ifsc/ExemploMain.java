package ifsc;
import java.util.ArrayList;
import java.util.Scanner;
import controle.PessoaDAO;
import modelo.Pessoa;

public class ExemploMain {

		public static void main(String[] args) {

			Integer opcaoSelecionada = Integer.MAX_VALUE;
			Scanner leitura = new Scanner(System.in);
			ArrayList<Pessoa> pessoas = new ArrayList<>();

			while (opcaoSelecionada != 0) {

				/**
				 * Esta é so uma proposta de menu de sistema.
				 * 
				 * Voce nao precisa seguir esta ordem, desde que seu sistema respeite a logica
				 * de incluir, alterar, listar e excluir de alguma forma.
				 */
				System.out.println("- MENU EXEMPLO -");
				System.out.println("0 SAIR");
				System.out.println("1 CADASTRAR");
				System.out.println("2 ALTERAR");
				System.out.println("3 EXCLUIR");
				System.out.println("4 LISTAR");

				opcaoSelecionada = Integer.valueOf(leitura.nextLine());

				switch (opcaoSelecionada) {
				case 0: {
					// Fecha sistema
					break;
				}
				case 1: {
					// Leitura de dados (input)
					System.out.println("Nome:");
					String nome = leitura.nextLine();
					System.out.println("Cpf:");
					String cpf = leitura.nextLine();

					Pessoa p = new Pessoa();
					p.setNome(nome);
					p.setCpf(Long.valueOf(cpf));

					pessoas.add(p);

				}
				case 2: {
					System.out.println("Digite o cpf da pessoa que deseja alterar:");
					// finalizar codigo
				}
				case 3: {
					System.out.println("Digite o cpf da pessoa que deseja excluir:");
					// finalizar codigo
				}
				case 4: {
					// Saida de dados (output)
					System.out.println("Listagem de pessoas cadastradas: ");
					for (Pessoa pessoa : pessoas) {
						System.out.println("Cpf: " + pessoa.getCpf());
						System.out.println("Nome: " + pessoa.getNome());
					}
				}

				}

			}

			leitura.close();
		}
	}

}
