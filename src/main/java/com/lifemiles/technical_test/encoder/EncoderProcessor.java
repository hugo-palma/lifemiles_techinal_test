package com.lifemiles.technical_test.encoder;


import java.util.ArrayList;
import java.util.List;

public abstract class EncoderProcessor {
    List<Encoder> parallelEncoderList = new ArrayList<>();
    //The encoders list must be set when extending the abstraction
    protected abstract List<Encoder> makeEncoderList();
    public void startProcessing(String inputText){
        this.parallelEncoderList = makeEncoderList();
        parallelEncoderList.parallelStream().forEach(encoder -> encoder.encode(inputText));
    }
}
