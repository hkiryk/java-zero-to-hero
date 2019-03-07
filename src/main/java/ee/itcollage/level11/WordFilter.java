package ee.itcollage.level11;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    //todo fix tests

    public List<Word> getNouns(List<Word> words) {
        List<Word> nouns = new ArrayList<>();
        for (Word word : words) {
            if (word.getWordType() == Word.WordType.NOUN) {
                nouns.add(word);
            }
        }
        return nouns;
    }

    public Word getFirstVerb(List<Word> words) {
        List<Word> verbs = new ArrayList<>();
        for (Word word : words) {
            if (word.getWordType() == Word.WordType.VERB) {
                verbs.add(word);
            }
        }
        return verbs.get(0);
    }

    public Word getFirstOfType(List<Word> words, Word.WordType type) {
        for (Word word : words) {
            if (word.getWordType()== type)
                return word;
        }
        return null;
    }
      /*  }
        return words.get(0);*/

    public List<Word> getAllNotNouns(List<Word> words) {
        List<Word > notNouns = new ArrayList<>();
        for (Word word : words) {
            if (word.getWordType()!= Word.WordType.NOUN) {
                notNouns.add(word);
            }
        }
        return notNouns;
    }


    public List<String> getNounStrings(List<Word> words){
        return new ArrayList<>();
    }

    public String getFirstVerbString(List<Word> words) {
        return "";
    }

    public String getFirstStringOfType(List<Word> words, Word.WordType type) {
        return "";
    }
}
