import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bem-vindo(a) ao Banco Terminal! Para criar a sua conta, comece inserindo o número da agência: ");
        String numeroAg = sc.nextLine();
        System.out.print("Agora insira o número da conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Agora insira o seu primeiro nome: ");
        String nomeCliente = sc.next();
        System.out.print("Agora insira o seu sobrenome: ");
        String sobrenomeCliente = sc.next();
        System.out.print("Agora insira o valor do seu primeiro depósito: ");
        double saldo = sc.nextDouble();

        System.out.print("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAg + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

        sc.close();
    }
}
