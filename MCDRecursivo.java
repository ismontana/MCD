import java.util.Scanner;
public class MCDRecursivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        int mcd = calcularMCD(num1, num2);

        System.out.println("El MCD entre " + num1 + " y " + num2 + " es: " + mcd);
    }

    public static int calcularMCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return calcularMCD(num2, num1 % num2);
        }
    }
}