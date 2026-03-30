import java.util.*;

public class Alphabet {
    private static final Character[] ALPHABET = {'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з',
            'и','к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '};

    private final List<Character> charList;
    private final Map<Character, Integer> charMap;

    public Alphabet(){
        charList = new ArrayList<>();
        charMap = new HashMap<>();

        charList.addAll(Arrays.asList(ALPHABET));
        for (int i = 0; i < this.charList.size(); i++) {
            charMap.put(charList.get(i), i);
        }
    }

    public Character getCharByIndex(int index){
        if(index<0 || index >= charList.size()){
            throw new AlphabetException("Некоррекный индекс "+ index);
        }
        return charList.get(index);
    }

    public int getIndexByChar(Character character){
        if(!charMap.containsKey(character)){
            throw new AlphabetException("Некорректный символ" + character);
        }
        return charMap.get(character);
    }

    public int getSize(){
        return charList.size();
    }
}
