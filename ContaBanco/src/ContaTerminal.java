import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("GOLIATH NATIONAL BANK");

        System.out.print("Favor inserir o número da conta: ");
        int numero = scanner.nextInt();

        System.out.print("Favor inserir o número da agência: ");
        String agencia = scanner.next();

        System.out.print("Favor inserir o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.print("Favor inserir o saldo inicial: ");
        double saldo = scanner.nextDouble();

        String mensagemFinal = "Sua agência é " + agencia + ", conta " + numero + " e seu saldo "
                + saldo + " ";

        System.out.println(mensagemFinal);

        scanner.close();
    }
}