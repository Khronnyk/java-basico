import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroDaConta;
        String agencia, nomeDoClinete;
        double saldo;

        System.out.print("Por favor digite o número da agência: ");
        agencia = sc.nextLine();

        System.out.print("Digite o número da conta: ");
        numeroDaConta = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome do cliente: ");
        nomeDoClinete = sc.nextLine();

        System.out.print("Digite o saldo: ");
        saldo = sc.nextDouble();

        System.out.println();

        System.out.printf("Olá, %s obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeDoClinete, agencia, numeroDaConta, saldo);
    }
}
