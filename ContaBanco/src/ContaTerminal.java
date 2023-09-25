import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome: ");
        String nomeUsuario = scanner.next();
        
        System.out.println("Digite sua Agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua Agencia: ");
        int numero = scanner.nextInt();
        
        System.out.println("Digite o seu Saldo: ");
        double saldo = scanner.nextDouble();

        String informar = "Olá "+nomeUsuario+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+",\n conta "+numero+ " e seu saldo "+saldo+" já está disponível para saque";
        System.out.println(informar);
    }
}
