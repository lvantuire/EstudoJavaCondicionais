import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {

        System.out.println("Discando...");

        do {
            // executando repetidas vezes até alguem atender (no caso atendeu for igual a 1)
            System.out.println("Telefone Tocando ");
        } while (tocando());

        System.out.println("Alo!!!");

    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        // negando o ato de continuar tocando
        return !atendeu;
    }

}
