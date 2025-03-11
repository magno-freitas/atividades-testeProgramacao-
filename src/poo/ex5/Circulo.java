// Crie uma classe chamada Circulo que tenha o atributo raio
// Calcule a área de 5 objetos diferentes de Circulo
// Para obter o valor de PI, use a função Math.PI do Java

package poo.ex5;
public class Circulo {
    public static final double PI=Math.PI;

        private double raio;
        double area;
        public void setRaio(double raio) {
            this.raio = raio;
        }
        public double getRaio() {
            return raio;
        }
        public double getArea() {
            return PI * raio * raio;
        }

        public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo();
        Circulo circulo3 = new Circulo();
        Circulo circulo4 = new Circulo();
        Circulo circulo5 = new Circulo();
        circulo1.setRaio(1);
        circulo2.setRaio(2);
        circulo3.setRaio(3);
        circulo4.setRaio(4);
        circulo5.setRaio(5);
        System.out.println("Circulo 1: " + circulo1.getArea());
        System.out.println("Circulo 2: " + circulo2.getArea());
        System.out.println("Circulo 3: " + circulo3.getArea());
        System.out.println("Circulo 4: " + circulo4.getArea());
        System.out.println("Circulo 5: " + circulo5.getArea());
        
        
    }
  
   
 

}
