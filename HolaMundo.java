import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hola Nicolas");
        System.out.print(4);
        System.out.print(4.6);
        System.out.print(4);

        System.out.printf("Nombre: %s", "Nicolas");
        System.out.printf("Edad: %d", 24);
        System.out.printf("Plata: %n");

        var sc = new Scanner(System.in);

        System.out.println("número");

        var entero = sc.nextInt();

        System.out.println(entero);
        sc.close();

    }


}