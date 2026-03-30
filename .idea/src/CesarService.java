import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

public class CesarService {
    FileManager fileNameManager;
    Validator fileNameValidator;
    Cipher cesarCipher;
    boolean enc = true;

    public  CesarService(){
        this.fileNameManager = new FileManager();
        this.fileNameValidator = new Validator();
        this.cesarCipher = new Cipher(new Alphabet());
    }

    public void processFile(String inputFile, String outputFile, int key){
        fileNameValidator.isFileExists(inputFile);
        fileNameValidator.isFileExists(outputFile);

        List<String> readLines = fileNameManager.readFile(inputFile);
        List<String> result = new ArrayList<>();

        for (String str : readLines) {
            if(enc) {
                result.add(cesarCipher.encrypt(str,key));
            } else {
                result.add(cesarCipher.decrypt(str, key));
            }
        }


    }


}
