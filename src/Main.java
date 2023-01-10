public class Main {
    public static void main(String[] args) {

        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        System.out.println(miCoche.puertas);

        int num1 = 2;
        int num2 = 6;
        int num3 = 22;

        int resultadoSuma = sumarNumeros(num1, num2, num3);
        System.out.println(resultadoSuma);
    }
        public static int sumarNumeros(int a,int b,int c){
            return a+b+c;
        }
}
class Coche {
    public int puertas = 2;
    public void agregarPuerta(){
        this.puertas ++;
    }
}