package com.lifemiles.technical_test.encoder.impl;

import com.lifemiles.technical_test.encoder.Encoder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TextToBatImpl implements Encoder {
    Map<String, Character> translationTable = new HashMap<>();
    public TextToBatImpl(){
        //TODO this would be loaded from application.properties
        translationTable.put("M", '0');
        translationTable.put("U", '1');
        translationTable.put("R", '2');
        translationTable.put("C", '3');
        translationTable.put("I", '4');
        translationTable.put("E", '5');
        translationTable.put("L", '6');
        translationTable.put("A", '7');
        translationTable.put("G", '8');
        translationTable.put("O", '9');
    }
    @Override
    public void encode(String text) {
        char[] result = text.toCharArray();
        for(Character character : result){
            if(translationTable.containsKey(character.toString().toUpperCase())){
                result[text.indexOf(character)] = translationTable.get(character.toString().toUpperCase());
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
