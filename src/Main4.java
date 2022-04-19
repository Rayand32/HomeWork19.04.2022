import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        System.out.println("Необходимо определить площадь его поверхности и объем: ");
        System.out.print("Введите изменерия паралеллиптеда");
        int Lenght = scanner.nextInt();
        int Width = scanner.nextInt();
        int Height = scanner.nextInt();

        int square = 2 * (Lenght * Width + Lenght * Height + Width * Height);
        int  volume = Height*Width*Lenght;

        System.out.print("Площадь поверхности: "+ square + "Объем " + volume);
    }
}
