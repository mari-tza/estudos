package Alura.CriandoPrimeiraAplicacao;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento");
        } else {
            System.out.println("Outros Filmes");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.printf("Filme Liberado");
        } else {
            System.out.printf("Filme Para Aluguel");
        }
    }
}
