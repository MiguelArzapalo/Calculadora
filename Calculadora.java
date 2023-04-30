import java.util.Scanner;

public class Calculadora {
    private Scanner scanner;

    public Calculadora() {
        scanner = new Scanner(System.in);
    }

    public void ejecutar() {
        int opcion = 0;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 5:
                    exponencial();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 6);
    }

    private void mostrarMenu() {
        System.out.println("Calculadora");
        System.out.println("-----------");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Exponencial");
        System.out.println("6. Salir");
        System.out.print("Ingrese una opción: ");
    }

    private void sumar() {
        double num1, num2, resultado;
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();
        resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    private void restar() {
        double num1, num2, resultado;
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();
        resultado = num1 - num2;
        System.out.println("El resultado de la resta es: " + resultado);
    }

    private void multiplicar() {
        double num1, num2, resultado;
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();
        resultado = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    private void dividir() {
        double num1, num2, resultado;
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero");
        } else {
            resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        }
    }

    private void exponencial() {
        double num, exponente, resultado;
        System.out.print("Ingrese el número: ");
        num = scanner.nextDouble();
        System.out.print("Ingrese el exponente: ");
        exponente = scanner.nextDouble();
        resultado = Math.pow(num, exponente);
        System.out.println("El resultado de la exponencial es: " + resultado);
    }
