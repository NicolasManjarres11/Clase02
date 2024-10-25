import java.util.Scanner;

public class InsertThreeWords {
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
        

        System.out.println("Introduzca la palabra 1: ");
        String p1 = sc.nextLine();

        System.out.println("Introduzca la palabra 2: ");
        String p2 = sc.nextLine();

        System.out.println("Introduzca la palabra 3: ");
        String p3 = sc.nextLine();

        System.out.println(p1 + " " + p2+ " " + p3);

    }
}
