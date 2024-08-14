package br.com.ramos.victor.tarefa_calculo_media;

public class Media {

    private float nota_a;
    private float nota_b;
    private float nota_c;
    private float nota_d;

    public Media(float a, float b, float c, float d){
        this.nota_a = a;
        this.nota_b = b;
        this.nota_c = c;
        this.nota_d = d;
    }

    public void calculaMediaEImprime(){

        float media = (this.nota_a+this.nota_b+this.nota_c+this.nota_d)/4;

        System.out.println("A média das notas:" +
              "\n\t prova A: " + this.nota_a +
              "\n\t prova B: " + this.nota_b +
              "\n\t prova C: " + this.nota_c +
              "\n\t prova D: " + this.nota_d +
              "\nÉ igual a: " + media);
    }

    public static void main(String[] args) {
        Media m = new Media(8, 9, 10, 8);
        m.calculaMediaEImprime();
    }
}