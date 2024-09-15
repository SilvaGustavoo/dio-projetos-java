import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        // Exemplo de criação de uma conta bancária

        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem vindo ao Banco DIO");

        // Entrada da variavel CONTA
        System.out.println("Por favor, digite o número da Conta !");
        System.out.print("Conta: ");
        int numero = leitor.nextInt();
        leitor.nextLine(); // Buffer de Teclado

        System.out.println(" "); // Pular linhas

        // Entrada da variavel AGÊNCIA
        System.out.println("Por favor, digite o número da Agência !");
        System.out.print("Agência: ");
        String agencia = leitor.nextLine();

        System.out.println(" "); // Pular linhas

        // Entrada da variavel USUARIO
        System.out.println("Por favor, digite o nome de Usuário !");
        System.out.print("Usuário: ");
        String nomeCliente = leitor.nextLine();

        System.out.println(" "); // Pular linhas

        // Entrada da variavel SALDO
        System.out.println("Por favor, digite o valor que possui de Saldo !");
        System.out.print("Saldo: ");
        double saldo = leitor.nextDouble();

        System.out.println(" "); // Pular linhas


        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo R$ "+ saldo +" reais já está disponível para saque.");





    }
}
