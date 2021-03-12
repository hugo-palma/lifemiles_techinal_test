package com.lifemiles.technical_test.encoder.impl;

import com.lifemiles.technical_test.encoder.Encoder;

public class TextToBinaryImpl implements Encoder {
    @Override
    public void encode(String text) {
        StringBuilder builder = new StringBuilder();
        StringBuilder binaryBuilder;
        for(char character : text.toCharArray()){
            binaryBuilder = new StringBuilder();
            binaryBuilder.append(Integer.toBinaryString(character));
            while(binaryBuilder.length() < 8){
                //Adding values to have 8 bits
                binaryBuilder.insert(0, 0);
            }
            builder.append(binaryBuilder.toString());
            builder.append(" ");
        }
        builder.deleteCharAt(builder.length() - 1);
        System.out.println(builder.toString());
    }
}
