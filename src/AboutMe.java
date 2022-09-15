import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // ? Criação do objeto scanner
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite Seu Nome ");
            String nome = scanner.next();

            System.out.println("Digite Seu Sobrenome ");
            String sobrenome = scanner.next();

            System.out.println("Digite Sua Idade ");
            int idade = scanner.nextInt();

            System.out.println("Digite Sua Altura ");
            double altura = scanner.nextDouble();

            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " " + "anos");
            System.out.println("Minha altura é " + altura + " cm");
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Os Campos Idade e Altura só aceitam numeros e .");
        }
    }

}
