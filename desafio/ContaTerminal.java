package java.desafio.view;
import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ContaBanco contaBanco = new ContaBanco();

		System.out.print("Nome Cliente: ");
		contaBanco.setNomeCliente(ler.nextLine());

		System.out.print("Agência do Banco: ");
		contaBanco.setAgencia(ler.nextLine());

		contaBanco.setNumeroConta((int)validarNumero(ler, "Número da Conta: ", "\nEntrada Inválida! Tente Novamente.\n\n"));

		contaBanco.setSaldo(validarNumero(ler, "Saldo: ", "\nSaldo Inválido! Tente Novamente.\n\n"));

		System.out.print("\nOlá " + contaBanco.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, \n"
				+ "sua agência é " + contaBanco.getAgencia() + ", conta " + contaBanco.getNumeroConta()
				+ "\ne seu saldo de R$" + contaBanco.getSaldo() + " reais já está disponível para saque.");
	}
	
	//------------------------------------------------------------------------------
	// Descrição_:Função que trata erros durante o preenchimento de dados numéricos.
	// Entrada___: Sem parâmetos.
	// Saída_____: Retorna um número double.
	//------------------------------------------------------------------------------
	static double validarNumero(Scanner ler, String rotulo, String mensagem) {
		double numeroConta = 0;

		while(true) {
			System.out.print(rotulo);
			try {
				numeroConta = ler.nextInt();
				break;
			} catch (Exception e) {
				System.out.print(mensagem);
				ler.next();
			}
		}

		return numeroConta;
	}
}
