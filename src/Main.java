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

    public static String[] filterStringsByLength(String[] array, int maxLength) {
        int count = 0;
        for (String s : array) {
            if (s.length() <= maxLength) {
                count++;
            }
        }

        String[] result = new String[count];
        int index = 0;

        for (String s : array) {
            if (s.length() <= maxLength) {
                result[index] = s;
                index++;
            }
        }

        return result;
    }
