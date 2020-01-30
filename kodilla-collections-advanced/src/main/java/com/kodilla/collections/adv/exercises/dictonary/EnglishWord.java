package com.kodilla.collections.adv.exercises.dictonary;

public class EnglishWord {
    private PartOfSpeech partOfSpeech;
    private String word;

    public PartOfSpeech getPartOfSpeech() {
        return partOfSpeech;
    }

    public String getWord() {
        return word;
    }

    public EnglishWord(PartOfSpeech partOfSpeech, String word) {
        this.partOfSpeech = partOfSpeech;
        this.word = word;
    }
}
