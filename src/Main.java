import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner((System.in));

            System.out.println("Эта программа позволяет определить правдивость новости: ");

            System.out.print("Введите значения радиусов фермы и двух UFO: ");
            int farm = scanner.nextInt();
            int UFO1 = scanner.nextInt();
            int UFO2 = scanner.nextInt();

            if (UFO1+UFO2<=farm) {
                System.out.print("YES");
            } else {
                System.out.print("NO");
            }
        }
    }