package com.lifemiles.technical_test.encoder;

import com.lifemiles.technical_test.encoder.impl.TextToBatImpl;
import com.lifemiles.technical_test.encoder.impl.TextToBinaryImpl;
import com.lifemiles.technical_test.encoder.impl.TextToMorseImpl;

import java.util.ArrayList;
import java.util.List;

public class DefaultEncoderProcessor extends EncoderProcessor {
    @Override
    protected List<Encoder> makeEncoderList() {
        Encoder textToMorseImpl = new TextToMorseImpl();
        Encoder textToBinaryImpl = new TextToBinaryImpl();
        Encoder textToBatImpl = new TextToBatImpl();
        List<Encoder> encoderList = new ArrayList<>();
        encoderList.add(textToMorseImpl);
        encoderList.add(textToBinaryImpl);
        encoderList.add(textToBatImpl);
        return encoderList;
    }
}
