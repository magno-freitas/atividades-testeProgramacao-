
package poo.ex4;
public class Mercado {
    public static void main(String[] args) throws Exception {
        // Mercado 1
        double precoCompra = 2.50;
        double precoVenda = 3.50;
        int quantidadeVendida = 100;
        double lucro = (precoVenda - precoCompra) * quantidadeVendida;
        double lucroMaçãs1 = lucro;
        double lucroLaranjas1 = lucro;

        // Mercado 2
        precoCompra = 2.50;
        precoVenda = 3.00;
        quantidadeVendida = 150;
        lucro = (precoVenda - precoCompra) * quantidadeVendida;
        double lucroMaçãs2 = lucro;
        double lucroLaranjas2 = lucro;

        // Mercado 3
        precoCompra = 2.50;
        precoVenda = 3.20;
        quantidadeVendida = 120;
        lucro = (precoVenda - precoCompra) * quantidadeVendida;
        double lucroMaçãs3 = lucro;
        double lucroLaranjas3 = lucro;

        // a) Quem teve o maior lucro vendendo maçãs?
        double maiorLucroMaçãs = Math.max(lucroMaçãs1, Math.max(lucroMaçãs2, lucroMaçãs3));
        System.out.println("Maior lucro vendendo maçãs: " + maiorLucroMaçãs);

        // b) Quem teve o maior lucro vendendo laranjas?
        double maiorLucroLaranjas = Math.max(lucroLaranjas1, Math.max(lucroLaranjas2, lucroLaranjas3));
        System.out.println("Maior lucro vendendo laranjas: " + maiorLucroLaranjas);

        // c) Qual das lojas teve o maior lucro nesse ano específico?
        double totalLucro1 = lucroMaçãs1 + lucroLaranjas1;
        double totalLucro2 = lucroMaçãs2 + lucroLaranjas2;
        double totalLucro3 = lucroMaçãs3 + lucroLaranjas3;
        double maiorLucro = Math.max(totalLucro1, Math.max(totalLucro2, totalLucro3));
        double menorLucro = Math.min(lucroMaçãs1 + lucroLaranjas1, Math.min(lucroMaçãs2 + lucroLaranjas2, lucroMaçãs3 + lucroLaranjas3));

        // d) Qual das lojas teve o menor lucro?
        double menorLucroMaçãs = Math.min(lucroMaçãs1, Math.min(lucroMaçãs2, lucroMaçãs3));
        System.out.println("Menor lucro: " + menorLucroMaçãs);

        // e) Qual das lojas ficou no "meio" em termos de lucro?
        double mediaLucro = (totalLucro1 + totalLucro2 + totalLucro3) / 3;
        System.out.println("Média de lucro: " + mediaLucro);

        // f) Juntando as 3 lojas, a franquia teve um lucro maior vendendo maçãs ou laranjas?
        double totalLucroMaçãs = lucroMaçãs1 + lucroMaçãs2 + lucroMaçãs3;
        double totalLucroLaranjas = lucroLaranjas1 + lucroLaranjas2 + lucroLaranjas3;
        if (totalLucroMaçãs > totalLucroLaranjas) {
            System.out.println("A franquia teve um lucro maior vendendo maçãs.");
        } else {
            System.out.println("A franquia teve um lucro maior vendendo laranjas.");
        }
    }
}
