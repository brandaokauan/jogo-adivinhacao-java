public class Prodpreco {
    public static void main(String[] args) {
        double precop = 10.50;
        int quantidade = 3;
        double resultado = precop * quantidade;

        String print = String.format("O valor total da sua compra foi de R$%.2f", resultado);
        System.out.println(print);

    }
}