import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {

        int a, b;
        double c;

        Scanner input = new Scanner(System.in);
        System.out.print("You must write your first edge : ");
        a = input.nextInt();
        System.out.print("You must write your second edge : ");
        b = input.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hypotenuse : " + c);
    }
}
