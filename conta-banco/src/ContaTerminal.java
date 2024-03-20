
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da Agência !");
        int agencia = scanner.nextInt();


        System.out.println("Por favor, digite o número da Conta !");
        String conta = scanner.next();
        scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome e Sobrenome !");
        String nomeCliente = scanner.next();
        scanner.nextLine();

        System.out.println("Por favor, digite o valor a ser depositado !");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem de conta criada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu saldo %.2f já está disponível para saque",
                nomeCliente, agencia, conta, saldo);

        scanner.close();
    }
}