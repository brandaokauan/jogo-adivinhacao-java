public class Dolar {

    public static void main(String[] args) {

        double valorEmDolares = 20.75;
        double dolarValor = 4.94;
        double resultado = dolarValor * valorEmDolares;

        String print = String.format("O valor de %.2f dólares em Reias fica %.2f ", valorEmDolares, resultado);

        System.out.println(print);

    }
}