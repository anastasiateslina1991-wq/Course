import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileManager {
    public List<String> readFile(String fileName) throws FileProcessingException {

        //Считываем данные из файла
        try{
            Path filePath = Path.of(fileName);
            System.out.println(Files.readAllLines(filePath));
        return Files.readAllLines(filePath);
        }
        catch  (IOException e)
        {throw new FileProcessingException(e.getMessage());}
    }

    public void writeFile(String content, String fileName) throws FileProcessingException {

        //Записываем данные в файл
        try{
            Path filePath = Path.of(fileName);
            Files.writeString(filePath, content);
        }
        catch (IOException e) {
            throw new FileProcessingException(e.getMessage());}
        }
    }


