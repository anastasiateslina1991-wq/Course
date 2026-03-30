import java.nio.file.Files;
import java.nio.file.Path;

public class Validator {
    public boolean isValidKey(int key, char[] alphabet) {
        // Проверка ключа
        return true;
    }
    public boolean isFileExists(String filePath) {
        //Проверка корректности пути и наличия файла
       Path path = Path.of(filePath);
       if (Files.isRegularFile(path) && Files.exists(path)) {
       return  true;
       } else {
           throw new IllegalArgumentException("Неверное имя файла или файл " + path +" не существует.");
       }
}
}
