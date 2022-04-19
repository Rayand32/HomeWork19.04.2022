import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));

        System.out.println("Эта программа позволяет узнать когда отмечаеться день програмиста ");

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        if (year / 400 == 0 || (year % 4 == 0 && year / 100 != 0)) {
            System.out.println("12.09.2000");
        } else {
            System.out.println("13.09.2009");
        }
    }
}