package br.com.ramos.victor.tarefa_wrapper;

import java.util.Scanner;

public class SimulaCasting {
    public static void main(String[] args) {

        System.out.print("Digite um dado primitivo do tipo Inteiro (int): ");
        Scanner sc = new Scanner(System.in);

        try {
            // int primitivo
            int i = sc.nextInt();
            System.out.println(i + " é um int primitivo");

            // autoboxing
            Integer in = i;
            System.out.println(in + " agora é um wrapper do tipo Integer");

            // casting
            double d = in;
            System.out.println(d + " agora é um primitivo do tipo double");

        } catch (Exception e) {
            System.out.println("Dado fornecido não é um inteiro");
        }
    }
}
