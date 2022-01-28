import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Name:");
        String first_name = input.nextLine();
        System.out.println("Enter the Last Name:");
        String last_name = input.nextLine();
        String name = first_name + " " + last_name;
        System.out.println("Enter the Age:");
        int age = input.nextInt();
        System.out.println("Enter the Sex:");
        char sex = input.next().charAt(0);
        System.out.println("Enter the Experience in Years:");
        double experience = input.nextDouble();
        System.out.println("Is Employee Active:");
        boolean is_active = input.nextBoolean();


        System.out.println();
        System.out.println("Employee Details:");
        System.out.println("\tName: " + name);
        System.out.println("\tAge: " + age);
        System.out.println("\tSex: " + sex);
        System.out.println("\tExperience:" + experience);
        System.out.println("\tIs Active:" + is_active);
    }
}
