public class Cipher {
    private final Alphabet alphabet;

    public Cipher(Alphabet alphabet) {
        this.alphabet = alphabet;
    }

    //Шифрование
    public String encrypt(String text, int shift) {
        String result = null;
        int size = alphabet.getSize();

        for (int i = 0; i < text.length(); i++) {
            char temp = Character.toLowerCase(text.charAt(i));
            int indexTemp = alphabet.getCharByIndex(temp);
            int newIndex = (indexTemp + shift) % size;

            if (newIndex < 0 ){
                newIndex = newIndex + size;
            }
            char newChar = alphabet.getCharByIndex(newIndex);
            result = result + newChar;
        }
        return result;
    }

    //Дешифрование
    public String decrypt(String encryptedText, int shift) {
        String result = null;
        int size = alphabet.getSize();

        for (int i = 0; i < encryptedText.length(); i++) {
            char temp = Character.toLowerCase(encryptedText.charAt(i));
            int indexTemp = alphabet.getCharByIndex(temp);
            int newIndex = (indexTemp - shift) % size;

            if (newIndex < 0 ){
                newIndex = newIndex + size;
            }
            char newChar = alphabet.getCharByIndex(newIndex);
            result = result + newChar;
        }
        return result;
    }
}
