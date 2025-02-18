import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da conta: ");
        int numAccount = scan.nextInt();
        scan.nextLine();
        System.out.print("Por favor, digite o número da Agência: ");
        String agencyCode = scan.nextLine();
        System.out.print("Por favor, digite o seu nome: ");
        String clienteName = scan.nextLine();
        System.out.print("Por favor, digite um valor para depósito inicial: ");
        double amount = scan.nextDouble();


        Account acc = new Account(numAccount, agencyCode, clienteName, amount);

        System.out.println(acc.toString());

        scan.close();
    }
}
