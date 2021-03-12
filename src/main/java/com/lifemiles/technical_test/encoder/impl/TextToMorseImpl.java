package com.lifemiles.technical_test.encoder.impl;

import com.lifemiles.technical_test.encoder.Encoder;

import java.util.HashMap;
import java.util.Map;

public class TextToMorseImpl implements Encoder {
    Map<String, String> translationTable = new HashMap<>();
    public TextToMorseImpl(){
        //TODO this would be loaded from application.properties
        translationTable.put("a", ".-");
        translationTable.put("b", "-...");
        translationTable.put("c", "-.-.");
        translationTable.put("d", "-..");
        translationTable.put("e", ".");
        translationTable.put("f", "..-.");
        translationTable.put("g", "--.");
        translationTable.put("h", "....");
        translationTable.put("i", "..");
        translationTable.put("j", ".---");
        translationTable.put("k", "-.-");
        translationTable.put("l", ".-..");
        translationTable.put("m", "--");
        translationTable.put("n", "-.");
        translationTable.put("o", "---");
        translationTable.put("p", ".--.");
        translationTable.put("q", "--.-");
        translationTable.put("r", ".-.");
        translationTable.put("s", "...");
        translationTable.put("t", "-");
        translationTable.put("u", "..-");
        translationTable.put("v", "...-");
        translationTable.put("w", ".--");
        translationTable.put("x", "-..-");
        translationTable.put("y", "-.--");
        translationTable.put("z", "--..");

    }
    @Override
    public void encode(String text) {
        StringBuilder result = new StringBuilder();
        for(Character c : text.toCharArray()){
            result.append(translationTable.get(String.valueOf(c).toLowerCase()));
            result.append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        System.out.println(result.toString());
    }
}
