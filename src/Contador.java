import java.util.Locale;
import java.util.Scanner;

/**
 * <h1>Contador</h1>
 * Mini projeto para imprimir uma contagem de números a partir da diferença de 2 números
 * @author Jefferson Moura
 * @since 15/09/2023
 * @version 1.0
 */
public class Contador {
    /**
     * <h2>Método contar</h2>
     * Calcula a diferença de 2 números e imprime a quantidade de números correspondente
     * @param parametro1 se refere ao primeiro número
     * @param parametro2 se refere ao segundo número
     * @throws ParametrosInvalidosException quando o segundo número não é maior que o primeiro
     */
    public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro2 > parametro1) {
            int quantidadeInteracao = parametro2 - parametro1;
            for (int c = 1; c <= quantidadeInteracao; c++) {
                System.out.printf("Imprimindo o número %d %n", c);
            }
        } else {
            throw new ParametrosInvalidosException();
        }
    }
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.US);
            System.out.println("Digite o primeiro parâmetro:");
            int primeiroParametro = scanner.nextInt();
            System.out.println("Digite o segundo parâmetro:");
            int segundoParametro = scanner.nextInt();
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        } finally {
            System.out.println("Finalizando operação.");
        }

    }
}
