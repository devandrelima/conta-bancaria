package java.desafio.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {

	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		ContaBanco contaBanco = new ContaBanco();

		System.out.print("Nome Cliente: ");
		contaBanco.setNomeCliente(ler.nextLine());

		System.out.print("Agência do Banco: ");
		contaBanco.setAgencia(ler.nextLine());

		contaBanco.setNumeroConta(preencherNumeroConta());

		contaBanco.setSaldo(preencherSaldo());

		System.out.print("\nOlá " + contaBanco.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, \n"
				+ "sua agência é " + contaBanco.getAgencia() + ", conta " + contaBanco.getNumeroConta()
				+ "\ne seu saldo de R$" + contaBanco.getSaldo() + " reais já está disponível para saque.");
	}
	
	//------------------------------------------------------------------------------------------
	// Descrição_: Função que trata erros durante o preenchimento da entrada do número da conta.
	// Entrada___: Sem parâmetos.
	// Saída_____: Retorna um número inteiro.
	//------------------------------------------------------------------------------------------
	static int preencherNumeroConta() {
		boolean sair;
		int numeroConta = 0;

		do {
			sair = false;
			System.out.print("Número da Conta: ");
			try {
				numeroConta = ler.nextInt();
			} catch (InputMismatchException e) {
				sair = true;
				System.out.print("\nInválido! Tente Novamente com número inteiro!\n\n");
				ler.next();
			}
		} while (sair);

		return numeroConta;
	}
	
	//----------------------------------------------------------------------------------------
	// Descrição_:Função que trata erros durante o preenchimento da entrada do saldo da conta.
	// Entrada___: Sem parâmetos.
	// Saída_____: Retorna um número double.
	//----------------------------------------------------------------------------------------
	static double preencherSaldo() {
		boolean sair;
		double saldo = 0.0;

		do {
			sair = false;
			System.out.print("Saldo: ");
			try {
				saldo = ler.nextDouble();
			} catch (InputMismatchException e) {
				sair = true;
				System.out.print("\nSaldo Inválido! Tente Novamente!\n\n");
				ler.next();
			}
		} while (sair);

		return saldo;
	}
}
