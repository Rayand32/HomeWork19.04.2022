import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int carbonInAtom = 2;
        int hydrogenInAtom = 6;
        int oxygenInAtom = 1;

        Scanner scanner = new Scanner((System.in));

        System.out.println("Эта программа позволяет узнать сколько можно из данных атамов получить молекул спирта.");

        System.out.print("Введите то количесво атамов углерода, водорода и кислорода соответственно: ");
        int carbon = scanner.nextInt();
        int hydrogen = scanner.nextInt();
        int oxygen = scanner.nextInt();

        int resultcarbon = carbon / carbonInAtom;

        int resulthydrogen = hydrogen / hydrogenInAtom;

        int resultoxygen = oxygen / oxygenInAtom;

        if (resultcarbon<=resulthydrogen && resultcarbon<=resultoxygen) {
            System.out.print(resultcarbon);
        } else if ((resulthydrogen<=resultcarbon && resulthydrogen<=resultoxygen)){
            System.out.print(resulthydrogen);
        } else {
            System.out.print(resultoxygen);
        }
    }
}