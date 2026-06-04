import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = sc.nextInt();

        System.out.println("Enter b:");
        int b = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter operation:");
        String operation = sc.nextLine();

        if (operation.equals("addition")) {
            System.out.println(a + b);
        }
        else if (operation.equals("subtraction")) {
            System.out.println(a - b);
        }
        else if (operation.equals("multiplication")) {
            System.out.println(a * b);
        }
        else if (operation.equals("division")) {
            System.out.println(a / b);
        }
        else{
            System.out.println("Invalid operation");
        }
    }
}