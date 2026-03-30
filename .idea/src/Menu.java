import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    public static void start() throws IOException {
        System.out.println("Выбирите действие");
        System.out.println(Arrays.toString(Command.values()));

        //Считываем ввод команды пользователя
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        Command command;
        try {
            // Пытаемся превратить строку в Enum
            command = Command.valueOf(answer);
        } catch (IllegalArgumentException e) {
            // Если ввели абракадабру, которой нет в Enum
            command = Command.UNKNOWN;
        }

        switch (command) {
            case ENCRYPT -> {
                System.out.println("Начинаю чтение файла...");
                FileManager file = new FileManager();
                file.readFile("src/from.txt");
            }

            case DECRYPT -> System.out.println("Начинаю запись в файл...");
            case EXIT -> System.out.println("Выход из программы.");
            case UNKNOWN -> System.out.println("Ошибка: команда '" + answer + "' не распознана.");
        }

    }
}
