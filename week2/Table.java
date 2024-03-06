package week2;

public class Table {
    public static void main(String[] args) {
        // Student data
        String[] names = {"Joe", "William", "Mary", "John", "Emma"};
        int[] labPoints = {43, 50, 39, 45, 48};
        int[] bonusPoints = {7, 8, 10, 5, 9};

        // Print table header
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==          Student Points          ==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");

        // Print table body
        System.out.println("Name\t\tLab\tBonus\tTotal");
        System.out.println("----\t\t---\t-----\t-----");

        for (int i = 0; i < names.length; i++) {
            int total = labPoints[i] + bonusPoints[i];
            System.out.println(names[i] + "\t\t" + labPoints[i] + "\t" + bonusPoints[i] + "\t" + total);
        }
    }
}

