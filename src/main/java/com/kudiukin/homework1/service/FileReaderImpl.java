package com.kudiukin.homework1.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
public class FileReaderImpl implements FileReader{
    @Setter
    private ClassPathResource resource;

    private List<List<String>> records;

    public static String regex = ",";

    public void readResource() {
        String line;
        records = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                resource.getInputStream()))) {
            while ((line = reader.readLine()) != null) {
                String[] units = line.split(regex);
                records.add(Arrays.asList(units));
//            } else {
//                System.out.println("Вопросы закончились.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}