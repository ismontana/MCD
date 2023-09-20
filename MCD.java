import java.util.Scanner;
public class MCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();

        int mcd = calcularMCD(num1, num2);

        System.out.println("El MCD entre " + num1 + " y " + num2 + " es: " + mcd);
    }

    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}