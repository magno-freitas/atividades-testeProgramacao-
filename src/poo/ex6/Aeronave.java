// Faça uma classe chamada Aeronave.
// Com os atributos:
// • Modelo
// • Passageiros
// • Velocidade máxima
// • Capacidade de combustível
// • Queima de combustível por minuto
// Crie 4 objetos de sua preferência.
// Calcule:
// a) Qual das aeronaves pode ficar no ar por mais tempo?
// b) Qual aeronave leva o maior número de passageiros?
// c) Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais
// longe?

package poo.ex6;

public class Aeronave {
    private String modelo;
    private int passageiros;
    private int velocidadeMaxima;
    private int capacidadeCombustivel;
    private double queimaCombustivel;

    public Aeronave(String modelo, int passageiros, int velocidadeMaxima, int capacidadeCombustivel, double queimaCombustivel) {
        this.modelo = modelo;
        this.passageiros = passageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.queimaCombustivel = queimaCombustivel;
    }
    public double tempoVooMaximo() {
        return (double) capacidadeCombustivel / queimaCombustivel;
    }
    public int passageirosMaximos() {
        return passageiros;
    }
    public double distanciaMaxima() {
        return (double) velocidadeMaxima * tempoVooMaximo();
    }
    public String getModelo() {
        return modelo;
    }
    
        public static void main(String[] args) {
            // Criando 4 aeronaves com dados fictícios
            Aeronave boeing747 = new Aeronave("Boeing 747", 366, 988, 238840, 190);
            Aeronave airbusA380 = new Aeronave("Airbus A380", 525, 945, 320000, 250);
            Aeronave embraerE195 = new Aeronave("Embraer E195", 124, 870, 23600, 65);
            Aeronave cessna172 = new Aeronave("Cessna 172", 4, 226, 212, 0.5);

        Aeronave[] aeronaves = {boeing747, airbusA380, embraerE195, cessna172};

        // a) Aeronave com maior tempo de voo
        Aeronave maiorTempoVoo = aeronaves[0];
        for (Aeronave aeronave : aeronaves) {
            if ( aeronave.tempoVooMaximo() > maiorTempoVoo.tempoVooMaximo()) {
                maiorTempoVoo = aeronave;
            }
        }

        // b) Aeronave com maior número de passageiros
        Aeronave maiorPassageiros = aeronaves[0];
        for (Aeronave aeronave : aeronaves) {
            if (aeronave.passageirosMaximos() > maiorPassageiros.passageirosMaximos()) {
                maiorPassageiros = aeronave;
            }
        }

        // c) Aeronave que voa mais longe
        Aeronave maiorDistancia = aeronaves[0];
        for (Aeronave aeronave : aeronaves) {
            if (aeronave.distanciaMaxima() > maiorDistancia.distanciaMaxima()) {
                maiorDistancia = aeronave;
            }
        }

        // Imprimindo os resultados
        System.out.println("a) Aeronave com maior tempo de voo: " + maiorTempoVoo.modelo + 
                          " (" + String.format("%.2f", maiorTempoVoo.tempoVooMaximo()) + " minutos)");
        
        System.out.println("b) Aeronave com mais passageiros: " + maiorPassageiros.modelo + 
                          " (" + maiorPassageiros.passageirosMaximos() + " passageiros)");
        
        System.out.println("c) Aeronave com maior alcance: " + maiorDistancia.modelo + 
                          " (" + String.format("%.2f", maiorDistancia.distanciaMaxima()) + " km)");
    }
}