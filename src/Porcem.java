public class Porcem {

    public static void main(String[] args) {

        double precoOriginal = 1000;
        double percentualDesconto = 10;
        double resulDesconto = precoOriginal - ((1000 * 10) /100);

        String print = String.format("O preço original de %.2f do seu produto, após o desconto ficou %.2f", precoOriginal, resulDesconto);

        System.out.println(print);
    }
}