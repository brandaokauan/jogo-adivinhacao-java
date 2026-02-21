public class Conversao {

    public static void main(String[] args){
        double tempC = 32.5;
        double Fahrenheit = (tempC * 1.8) + 32;

        String print = String.format("A temperatura %.1f graus Celsius convertendo para Fahrenheit é %.1f", tempC, Fahrenheit);

        System.out.println(print);

        int semDec = (int) Fahrenheit; //casting explícito

        System.out.println("A temperatura inteira em Fahrenheit é de: " + semDec);
    }
}