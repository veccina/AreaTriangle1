import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, d;
        double f ;

        Scanner input = new Scanner(System.in);
        System.out.println("First side : ");
        a = input.nextInt();
        System.out.println("Second side : ");
        b = input.nextInt();
        System.out.println("Third side");
        c = input.nextInt();
        d = ( (a + b + c) / 2 );
        f = Math.sqrt(d * (d-a) * (d-b) * (d-c));
        System.out.println("Area of Triangle :" + f);
    }
}