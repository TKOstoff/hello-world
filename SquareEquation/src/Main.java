import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете коефициенти a, b и c: ");
        System.out.print("Въведете а: ");
        int a = input.nextInt();
        System.out.println("а=" + a);
        System.out.print("Въведете b: ");
        int b = input.nextInt();
        System.out.println("b=" + b);
        System.out.print("Въведете c: ");
        int c = input.nextInt();
        System.out.println("c=" + c);
        int d = (b*b) - (4*a*c);
        System.out.println("D=" + d);
        int x1 = (int) ((-b + Math.sqrt(d))/(2 * a));
        int x2 = (int) ((-b - Math.sqrt(d))/(2 * a));


        if (d<0) {
            System.out.println("There are no real roots");
        } else if (d==0) {
            System.out.println("x1=x2= " + x1);
        } else {
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }

    }
}