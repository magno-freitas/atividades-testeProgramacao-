package poo.ex2;
public class ex2 {
    public static void main(String[] args) {
        Mercado unidadeDeBlumenau = new Mercado("Mercado Blumenau", 5000, 1.50, 3000, 2.00);
        Mercado unidadeDeJoinville = new Mercado("Mercado Joinville", 4500, 1.45, 3500, 1.95);
        Mercado unidadeDeFlorianopolis = new Mercado("Mercado Florianópolis", 6000, 1.55, 4000, 2.10);
    }
}

class Mercado{
    private String nome;
    private int nMaca;
    private double preco;
    private int nLaranja;
    private double precoL;

    public Mercado(String nome, int nMaca, double preco, int nLaranja, double precol){
        this.nome=nome;
        this.nMaca=nMaca;
        this.preco=preco;
        this.nLaranja=nLaranja;
        this.precoL=precol;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnMaca() {
        return nMaca;
    }

    public void setnMaca(int nMaca) {
        this.nMaca = nMaca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getnLaranja() {
        return nLaranja;
    }

    public void setnLaranja(int nLaranja) {
        this.nLaranja = nLaranja;
    }

    public double getPrecoL() {
        return precoL;
    }

    public void setPrecoL(double precoL) {
        this.precoL = precoL;
    }
    
}
