import java.util.Scanner;

public class Calculator
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Welcome to the Simple Math Program!");

        System.out.println("Enter the two integers to add.");
        System.out.print("First integer: ");
        int x = scanner.nextInt();
        System.out.print("Second integer: ");
        int y = scanner.nextInt();
        AdditionOps add = new AdditionOps(x,y);
        int product = add.getProduct();
        System.out.println("The product of the two integers is: " + product);
    }
}
