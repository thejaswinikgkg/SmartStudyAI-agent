import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Smart Study AI Agent");

        System.out.print("Enter number of days left: ");
        int days = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        for (int i = 1; i <= days; i++) {
            System.out.println("Day " + i + ": Study Subject " + ((i % subjects) + 1));
        }

        sc.close();
    }
}
