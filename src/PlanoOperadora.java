//? utilizando o swithcase sem breack para incluir as opções abaixo
//? do codigo

public class PlanoOperadora {
    public static void main(String[] args) {

        String plano = "B"; // T Turbo M Mega, B Basico

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Whats e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de Ligação");
            }

            default:
                break;
        }
    }

}
