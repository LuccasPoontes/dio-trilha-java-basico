import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        // Importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Exibir as mensagens para o nosso usuário
        System.out.println("Bem-vindo ao Banco Callyn.");
        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();
        
        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha deixada pelo nextInt
        
        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();
        
        // Exibir a mensagem conta criada
        System.out.println("Conta criada com sucesso!");
        System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Saldo: R$ " + saldo);
        
        // Fechar o scanner
        scanner.close();
    }
}
