package poo.ex1;
public class ex1{
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 'M', "01/01/1990", "Solteiro");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Sexo: " + pessoa.getSexo());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
        System.out.println("Estado Civil: " + pessoa.getEstadoCivil());
    }
}

class Pessoa {
    private String nome;
    private char sexo;
    private String dataNascimento;
    private String estadoCivil;

    public Pessoa(String nome, char sexo, String dataNascimento, String estadoCivil) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
        
    }
    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
}

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
