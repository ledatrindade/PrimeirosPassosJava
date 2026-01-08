import java.util.Scanner;

public class main {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Informe o valor do depósito inicial: R$ ");
	        ContaBancaria conta = new ContaBancaria(sc.nextDouble());

	        int opcao;
	        do {
	            System.out.println("""
	                    
	                    ===== MENU CONTA BANCÁRIA =====
	                    1 - Consultar saldo
	                    2 - Consultar cheque especial
	                    3 - Depositar dinheiro
	                    4 - Sacar dinheiro
	                    5 - Pagar boleto
	                    6 - Verificar uso do cheque especial
	                    0 - Sair
	                    """);

	            System.out.print("Escolha uma opção: ");
	            opcao = sc.nextInt();

	            switch (opcao) {
	                case 1 -> conta.consultarSaldo();

	                case 2 -> conta.consultarChequeEspecial();

	                case 3 -> {
	                    System.out.print("Informe o valor do depósito: R$ ");
	                    double valor = sc.nextDouble();
	                    conta.depositar(valor);
	                }

	                case 4 -> {
	                    System.out.print("Informe o valor do saque: R$ ");
	                    double valor = sc.nextDouble();
	                    conta.sacar(valor);
	                }

	                case 5 -> {
	                    System.out.print("Informe o valor do boleto: R$ ");
	                    double valor = sc.nextDouble();
	                    conta.pagarBoleto(valor);
	                }

	                case 6 -> conta.verificarChequeEspecial();

	                case 0 -> System.out.println("Encerrando o sistema...");

	                default -> System.out.println("Opção inválida.");
	            }

	        } while (opcao != 0);

	        sc.close();
	    }
	}

