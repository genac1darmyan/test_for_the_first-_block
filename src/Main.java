import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите количество строк в массиве:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Пропустить перевод строки

        String[] inputArray = new String[n];
        System.out.println("Введите строки массива:");

        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextLine();
        }

        String[] resultArray = filterStringsByLength(inputArray, 3);
        System.out.println("Результат:");
        printArray(resultArray);

        scanner.close();
    }
