import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));

        System.out.println("Эта программа позволяет определить количество цапель: ");
        System.out.print("Введите то, сколько ног посчитали Маша и Петя");

        int Petia = scanner.nextInt();
        int Masha = scanner.nextInt();
        if (Petia<=Masha){
            System.out.print(Masha/2 + " " + Petia);
        } else  {
            System.out.print(Masha/2 + " " + Masha);
        }
    }
}