import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int conta;
        String agencia;
        String nomeCliente;
        double saldo;
        String mensagem;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o número da agência");
        agencia = scanner.next();

        System.out.println("Por favor digite o número da conta");
        conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor digite o nome do cliente");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor digite o saldo da conta");
        saldo = scanner.nextDouble();

        scanner.close();

        mensagem = "Olá " + nomeCliente;
        mensagem = mensagem.concat(", obrigado por criar uma conta em nosso banco, sua agência é " + agencia);
        mensagem = mensagem.concat(", conta " + conta);
        mensagem = mensagem.concat(" e seu saldo " + saldo);
        mensagem = mensagem.concat(" já está disponível para saque");

        System.out.println(mensagem);
    }
}
