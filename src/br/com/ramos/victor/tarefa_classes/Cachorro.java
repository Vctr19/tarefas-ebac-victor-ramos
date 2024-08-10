/**
 * @author victor.ramos
 */

package br.com.ramos.victor.tarefa_classes;

// Classe que representa um cachorro
public class Cachorro {

    // Atributos de um cachorro
    private String nome;
    private String cor;
    private String raca;
    private float peso;
    private float altura;
    private int idade;

    // Construtores
    public Cachorro(){}
    public Cachorro(String nome, String cor, String raca, float peso, float altura, int idade){}

    public void latir(){
        System.out.println("au au au!");
    }

    public void morder(){
        System.out.println("nhac nhac nhac!");
    }
    
    public void urinar(){
        System.out.println("xiiiii!");
    }

    /**
    * @param areaMarcada verificador da área, caso não esteja marcada o cão urina
    */
    public void marcarTerritorio(boolean areaMarcada){
        if(!areaMarcada){
            urinar();
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    } 

    public String getCor() {
        return cor;
    }

    public String getRaca() {
        return raca;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }
}
