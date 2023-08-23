import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        String saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        numero = scanner.nextInt();

        System.out.println("Digite o nome da Agência: ");
        agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Digite o saldo da sua conta: ");
        saldo = scanner.next();

        System.out.println("Olá " + nomeCliente + ", Obrigado por criar uma conta em nosso banco, " +
                "sua agência é: " + agencia + ", conta " + numero + " e seu saldo é: " + saldo + " Já est disponível para saque." );
    }
}