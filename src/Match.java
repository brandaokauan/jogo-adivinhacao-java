public class Match {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDelancamento = 2022;
        System.out.println("Ano de lançamento:" + anoDelancamento);
        boolean incluidoNoPlano = true;
        double NotaDoFilme = 8.1;
        //Média calculada pela soma das 3 notas dos jures
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println("A média das notas é de " + media);
        String sinopse;
        sinopse = """
                  Filme Top Gun
                  Filme de Aventura com galã dos anos 80
                  Muito bom!
                  Ano de lançamento
                  """ + anoDelancamento;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media /2);
        System.out.println(classificacao);


    }
}