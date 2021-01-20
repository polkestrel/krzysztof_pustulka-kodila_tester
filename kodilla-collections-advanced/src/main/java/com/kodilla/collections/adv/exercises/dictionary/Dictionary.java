package com.kodilla.collections.adv.exercises.dictionary;

import java.util.*;

public class Dictionary {
    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord(String polishWord, EnglishWord englishWord) {

        // Metoda ta pobiera z mapy listę angielskich słów,
        // odpowiadających wskazanemu słowu polskiemu. Jeżeli żadnego słowa angielskiego
        // w mapie nie ma, to tworzona jest pusta lista
        // (wykorzystujemy tu metodę getOrDefault z interfejsu Map, która zwraca
        // podaną jako argument wartość domyślną, gdy mapa nie zawiera szukanego przez nas wpisu).
        // Do tej listy (dotychczas istniejących w mapie słów angielskich lub nowej pustej listy)
        // dodawany jest nasz wpis. Następnie wpis ten jest wstawiany do mapy.
        // Metoda put mapy wstawi nowy wpis lub zaktualizuje istniejący,
        // jeżeli wpis o danym kluczu (czyli polskim słowie) był już wcześniej w mapie obecny.
        List<EnglishWord> englishWords = dictionary.getOrDefault(polishWord, new ArrayList<>());
        englishWords.add(englishWord);
        dictionary.put(polishWord,englishWords);

    }

    public List<EnglishWord> findEnglishWords(String polishWord) {
        return dictionary.getOrDefault(polishWord, Collections.emptyList());
    }

    // metoda wyszukuje wpierw wszystkie angielskie odpowiedniki polskiego słowa,
    // a następnie, używając pętli for-each, przepisuje do zmiennej 'result' tylko te
    // wyrazy angielskie, których pole 'partOfSpeech' jest zgodne z wyszukiwanym.
    public List<EnglishWord> findEnglishWords(String polishWord, PartOfSpeech partOfSpeech) {
        List<EnglishWord> result = new ArrayList<>();
        for (EnglishWord englishWord : dictionary.getOrDefault(polishWord, Collections.emptyList())) {
            if (englishWord.getPartOfSpeech().equals(partOfSpeech))
                result.add(englishWord);
        }
        return result;
    }

    public int size() {
        return dictionary.size();
    }
}
