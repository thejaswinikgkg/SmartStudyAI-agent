public class Main {
    public static void main(String[] args) {
        System.out.println("Smart Study AI Agent");

        int days = 3;
        int subjects = 2;

        for (int i = 1; i <= days; i++) {
            System.out.println("Day " + i + ": Study Subject " + ((i % subjects) + 1));
        }
    }
}
