public class Distributer {
    public static void main(String[] args) {

        double solde = 25.0;
        double ValorSolicitado = 5.0;

        if (ValorSolicitado <= solde) {
            solde = solde - ValorSolicitado;
            System.out.println("Novo solde  " + solde);
        } else {
            System.out.println("solde Insuficiente");
        }

    }
}
