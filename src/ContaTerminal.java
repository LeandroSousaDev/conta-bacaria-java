import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número de sua agência: ");
        String agencia = sc.nextLine();
        System.out.println();

        System.out.print("Agora digite o número de sua conta: ");
        String numeroContaStr = sc.nextLine();
        int numero = Integer.parseInt(numeroContaStr);
        System.out.println();

        System.out.print("Informe seu nome completo: ");
        String nomeCliente = sc.nextLine();
        System.out.println();

        System.out.print("Informe o valor do depósito inicial: ");
        String saldoStr = sc.nextLine();
        double saldo = Double.parseDouble(saldoStr);

        sc.close();

        DadosCliente cliente = new DadosCliente(numero, agencia, nomeCliente, saldo);

        System.out.println(cliente.toString());
    }
}
