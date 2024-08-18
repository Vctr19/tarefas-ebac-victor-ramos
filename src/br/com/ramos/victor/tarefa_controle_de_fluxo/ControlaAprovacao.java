package br.com.ramos.victor.tarefa_controle_de_fluxo;

import java.util.Scanner;

public class ControlaAprovacao {
    public static void main(String[] args) {
        float n1=0, n2=0, n3=0, n4=0;
        Scanner sc = new Scanner(System.in);

        for(int contador = 1; contador <= 4; contador++){
            System.out.print("Informar a nota do "+ contador + "° trimestre: ");
            if (contador == 1) n1 = sc.nextFloat();
            if (contador == 2) n2 = sc.nextFloat();
            if (contador == 3) n3 = sc.nextFloat();
            if (contador == 4) n4 = sc.nextFloat();
        }

        float media = (n1+n2+n3+n4)/4;

        if (media >=7) System.out.println("Aluno aprovado");
        if (media >=5 && media < 7) System.out.println("Aluno de recuperação");
        if (media < 5) System.out.println("Aluno reprovado");
    }
}
