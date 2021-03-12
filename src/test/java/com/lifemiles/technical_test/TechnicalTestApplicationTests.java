package com.lifemiles.technical_test;

import com.lifemiles.technical_test.encoder.DefaultEncoderProcessor;
import com.lifemiles.technical_test.encoder.Encoder;
import com.lifemiles.technical_test.encoder.EncoderProcessor;
import com.lifemiles.technical_test.encoder.impl.TextToBinaryImpl;
import com.lifemiles.technical_test.encoder.impl.TextToMorseImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class TechnicalTestApplicationTests {
    @Test
    void contextLoads() {
    }

    @Test
    public void testTextToBinaryEncoding(){
        Encoder textToBinaryImpl = new TextToBinaryImpl();
        textToBinaryImpl.encode("Kennia");
    }
    @Test
    public void testTextToMorseEncoding(){
        Encoder textToMorse = new TextToMorseImpl();
        textToMorse.encode("Kennia");
    }
    @Test
    public void testParallelEncoder(){
        EncoderProcessor encoderProcessor = new DefaultEncoderProcessor();
        encoderProcessor.startProcessing("Kennia");
    }
}
