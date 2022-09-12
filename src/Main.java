import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи количество элементов:");
        int size = scanner.nextInt();
        int[] myArray = new int[size];
        System.out.println("Введите элементы:");
        for (int i = 0; i < size; i++) {

            myArray[i] = scanner.nextInt();
        }
        System.out.print("Введенные элементы:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + myArray[i]);
        }
        System.out.println();
        System.out.print("Сумма элементов массива:");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + myArray[i];
        }
        System.out.print(" " + sum);
    }

}