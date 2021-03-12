package com.lifemiles.technical_test;

import com.lifemiles.technical_test.encoder.DefaultEncoderProcessor;
import com.lifemiles.technical_test.encoder.Encoder;
import com.lifemiles.technical_test.encoder.EncoderProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

@SpringBootApplication
public class TechnicalTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechnicalTestApplication.class, args);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input the string to encode:");
        String inputText = null;
        try {
             inputText = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        EncoderProcessor encodersProcessor = new DefaultEncoderProcessor();
        encodersProcessor.startProcessing(inputText);
    }

}
