package poo.ex7;  

public class  ex7{
    public static void main(String[] args) throws Exception {
        class Contribuinte {
            private String nome;
            private String cpf;
            private String uf;
            private double rendaAnual;

            public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
                this.nome = nome;
                this.cpf = cpf;
                this.uf = uf;
                this.rendaAnual = rendaAnual;
            }

            public String getNome() {
                return nome;
            }

            public double calcularImposto() {
                if (rendaAnual <= 4000) {
                    return 0;
                } else if (rendaAnual <= 9000) {
                    return rendaAnual * 0.058;
                } else if (rendaAnual <= 25000) {
                    return rendaAnual * 0.15;
                } else if (rendaAnual <= 35000) {
                    return rendaAnual * 0.275;
                } else {
                    return rendaAnual * 0.3;
                }
            }
        }
        Contribuinte[] contribuintes = new Contribuinte[5];
        contribuintes[0] = new Contribuinte("João da Silva", "123.456.789-00", "PR", 40000);
        contribuintes[1] = new Contribuinte("Maria da Silva", "123.456.789-01", "RS", 9000);
        contribuintes[2] = new Contribuinte("José da Silva", "123.456.789-02", "SC", 25000);
        contribuintes[3] = new Contribuinte("Pedro da Silva", "123.456.789-03", "PR", 35000);
        contribuintes[4] = new Contribuinte("Paulo da Silva", "123.456.789-04", "RS", 5000);

        Contribuinte maior = contribuintes[0];
        Contribuinte menor = contribuintes[0];
        double total = 0;
        for (Contribuinte contribuinte : contribuintes) {
            if (contribuinte.calcularImposto() > maior.calcularImposto()) {
                maior = contribuinte;
            }
            if (contribuinte.calcularImposto() < menor.calcularImposto()) {
                menor = contribuinte;
            }
            total += contribuinte.calcularImposto();
        }
        System.out.println("Quem mais paga imposto: " + maior.getNome());
        System.out.println("Quem menos paga imposto: " + menor.getNome());
        System.out.println("Total de imposto pago entre os 5 contribuintes: " + total);
    }
}
// Para efetuar o recolhimento do Imposto de Renda a Receita Federal tem o NOME, CPF, UF (RS,
// PR e SC) e RENDA ANUAL.
// EX:
// Nome: João da Silva
// CPF: 123.456.789-00
// UF: PR
// RendaAnual: R$40.000
// Para o cálculo do imposto a pagar de cada contribuinte, considere o seguinte:
// Nível de Renda Anual Alíquota
// 0 a 4.000 0%
// 4.001 a 9.000 5,8%
// 9.001 a 25.000 15%
// 25.001 a 35.000 27,5%
// acima de 35.000 30%
// Sendo assim, deve-se calcular o imposto a pagar do seguinte modo:
// Imposto a pagar = Renda Anual * Alíquota
// Crie 5 objetos da classe Contribuinte e coloque-os em um vetor.
// Calcule:
// a) Quem mais paga imposto.
// b) Quem menos paga imposto.
// c) Qual o total de imposto pago entre os 5 contribuintes?
