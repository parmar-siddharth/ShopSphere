package com.telusko.springecomai.service;

import org.springframework.ai.image.ImageModel;
import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;
import org.springframework.ai.openai.OpenAiImageOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Base64;

@Service
public class AIImageGeneratorService {

    @Autowired
    private ImageModel imageModel;

    public byte[] generateImage(String prompt) {
        try {
            OpenAiImageOptions options = OpenAiImageOptions.builder()
                    .N(1)
                    .width(1024)
                    .height(1024)
                    .quality("medium")          // low | medium | high
                    .model("gpt-image-1")       // dall-e-3 removed on May 12, 2026
                    .build();

            ImageResponse response = imageModel.call(new ImagePrompt(prompt, options));

            String b64Json = response.getResult().getOutput().getB64Json();
            return Base64.getDecoder().decode(b64Json);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}