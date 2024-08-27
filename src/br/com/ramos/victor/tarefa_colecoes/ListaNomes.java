package br.com.ramos.victor.tarefa_colecoes;

import java.util.*;

public class ListaNomes {

    public static void main(String[] args) {

        // Define qual dos inputs devem ser tratados
        Scanner sc = new Scanner(System.in);
        System.out.print("> Qual dos dois padrões de input será usado?" +
                "\n\t1-> Apenas nomes separados por virgula" +
                "\n\t2-> Nomes e sexo separados por virgula" +
                "\n> ");

        switch (sc.nextInt()){
            case 1:
                System.out.println("Insira os nomes conforme exemplo:" +
                        "\n\tMaria,Paula,Felipe,Diego,Marcos");
                listarNomesOrdemAlfabetica(sc.next());

            case 2:
                System.out.println("Insira os nomes e o sexo conforme exemplo:" +
                        "\n\tMaria-f,Paula-f,Felipe-m,Diego-m,Marcos-m");
                ListarNomesESexo(sc.next());
        }
    }

    private static void ListarNomesESexo(String nomesESexo) {
        // Dividindo a string em pares nome-sexo
        String[] pares = nomesESexo.split(",");

        Map<String, String> mapaNomesESexo = new HashMap<>();

        // Iterando os pares e populando o map
        for (String par : pares){
            // Divide cada par em nome e sexo
            String[] partes = par.split("-");
            // nome como chave e sexo como valor
            mapaNomesESexo.put(partes[0], partes[1]);
        }

        // Exibe nomes por sexo
        // Apenas sexo masculino
        System.out.println("Nomes do sexo Masculino:");
        for (Map.Entry<String, String> entrada : mapaNomesESexo.entrySet()) {
            if (entrada.getValue().equals("m")){
                System.out.println(entrada.getKey());
            }
        }

        // Apenas sexo feminino
        System.out.println("Nomes do sexo Feminino:");
        for (Map.Entry<String, String> entrada : mapaNomesESexo.entrySet()) {
            if (entrada.getValue().equals("f")){
                System.out.println(entrada.getKey());
            }
        }
    }

    private static void listarNomesOrdemAlfabetica(String nomes) {
        // Transferindo a string de nomes em uma lista de nomes
        List<String> listaNomes = new ArrayList<>(Arrays.asList(nomes.split(",")));
        // Organizando em ordem alfabetica
        Collections.sort(listaNomes);
        // Exibindo os nomes
        for (String n : listaNomes) {
            System.out.println(n);
        }
    }
}
