import java.util.Scanner;

public class Operacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();
         int resultado = num1 + num2;
        System.out.println("el resultado de la suma es: " + resultado);
    }
}
