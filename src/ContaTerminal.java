import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      DadosDoUsuario dadosDoUsuario = new DadosDoUsuario();
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome:");
        String nomeCliente = scanner.next();

        System.err.println("Digite o numero da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite a agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o seu saldo  ");
        BigDecimal saldo = scanner.nextBigDecimal();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$ " + saldo + " já está disponivel para saque. ");

    }
}
