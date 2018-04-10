import java.util.InputMismatchException;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //getIntUserInput(scanner, 1, 5);
        createArray(scanner);
    }

    private static int getIntUserInput(Scanner scanner, int min, int max) {
        scanner = new Scanner(System.in);//написав эту команду мы решим проблему рекурсии
        System.out.println("Введите число от " + min + " до " + max);
        int result;
        try {
            result = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число");
            return getIntUserInput(scanner, min, max);
        }
        if (result < min || result > max) {
            System.out.println("Вы ввели  число не от " + min + " до " + max);
            return getIntUserInput(scanner, min, max);
        }
        return result;
    }

    private static int[] createArray(Scanner scanner) {//пример рекурсии не при переполнении памяти
        System.out.println("Введите длину");
        int length = scanner.nextInt();
        int[] array = new int[length];
        if (length == 0 || length > 10) {
            System.out.println("длина должна быть от 1 до 10");
            array = createArray(scanner);
        }
        System.out.println("последний элемент = " + array[length - 1]);
        return array;
    }
}
