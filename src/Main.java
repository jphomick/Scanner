import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String initial, lastName, street, streetType, city;
        int houseNum;
        System.out.println("Enter your first initial:");
        initial = read.nextLine();
        System.out.println("Enter your last name:");
        lastName = read.nextLine();
        System.out.println("Enter your house number:");
        houseNum = read.nextInt();
        read.nextLine();
        System.out.println("Enter your street name:");
        street = read.nextLine();
        System.out.println("Enter your street type:");
        streetType = read.nextLine();
        System.out.println("Enter your city:");
        city = read.nextLine();

        System.out.println(initial + " " + lastName + "\n"
                + houseNum + " " + street + " " + streetType + " " + city);
    }
}
