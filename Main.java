import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("seleccione : \n 1. Circulo \n 2. Cuadrado");
        int opcion = scanner.nextInt();

        
        if (opcion == 1) {
            System.out.print("Ingrese el radio del circulo: ");
            double radio = scanner.nextDouble();

            Circulo circulo = new Circulo(radio);
            System.out.println("El area del circulo es: " + circulo.calcularArea());

        } else if (opcion == 2) {
            System.out.print("Ingrese el lado del cuadrado: ");
            double lado = scanner.nextDouble();

            Cuadrado cuadrado = new Cuadrado(lado);
            System.out.println("El area del cuadrado es: " + cuadrado.calcularArea());

        } else {
            System.out.println("ERROR");
        }

        scanner.close();
    }
}
