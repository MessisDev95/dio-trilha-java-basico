import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem vindo!");
        System.out.println("Por favor, digite o número da agencia:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta:");
           int numeroConta = scanner.nextInt();
          
          scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
          String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
          double saldo = scanner.nextDouble();
          
        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é "+ agencia +", conta "+ numeroConta +" e seu saldo "+ saldo +"R$, já está disponível para saque");  
      
    }
}
