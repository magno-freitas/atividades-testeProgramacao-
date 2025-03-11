// A partir das representações abaixo dos objetos de uma classe Produto.
// Escreva o código necessário para suportar tais objetos.
// Ou seja, o código necessário para criar a classe e instanciar os objetos de modo que fiquem
// com o estado apresentado.
// produto1: Produto
// nome = “Caderno”
// descricao = “Caderno em espiral tamanho médio”
// precoUnitario = 4.50
// desconto = 15
// produto2: Produto
// nome = “Caneta ESF”
// descricao = “Caneta esferográfica 5mm”
// precoUnitario = 1.20
// desconto = 2
// produto3: Produto
// nome = “Esquadro”
// descricao = “Esquadro de acrílico 20 cm”
// precoUnitario = 2.35
// desconto = 10
package poo.ex3;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        // Criando os produtos
        Produto produto1 = new Produto("Caderno", "Caderno em espiral tamanho médio", 4.50, 15);
        Produto produto2 = new Produto("Caneta ESF", "Caneta esferográfica 5mm", 1.20, 2);
        Produto produto3 = new Produto("Esquadro", "Esquadro de acrílico 20 cm", 2.35, 10);
    }

    

    public static class Produto {
        private String nome;
        private String descricao;
        private double precoUnitario;
        private int desconto;
    
        public Produto(String nome, String descricao, double precoUnitario, int desconto) {
            this.nome = nome;
            this.descricao = descricao;
            this.precoUnitario = precoUnitario;
            this.desconto = desconto;
        }
    
        // Getters e setters
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public String getDescricao() {
            return descricao;
        }
    
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
    
        public double getPrecoUnitario() {
            return precoUnitario;
        }
    
        public void setPrecoUnitario(double precoUnitario) {
            this.precoUnitario = precoUnitario;
        }
    
        public int getDesconto() {
            return desconto;
        }
    
        public void setDesconto(int desconto) {
            this.desconto = desconto;
        }
    }}