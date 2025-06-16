import java.util.Scanner;

public class ContaTerminal {   
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Solicita os dados ao usuário
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Exibe a mensagem final com concatenação
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " 
            + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");

        scanner.close();
    }
}

