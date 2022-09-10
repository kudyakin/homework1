package com.kudiukin.homework1;

import lombok.Getter;
import lombok.Setter;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@Service
public class FileReader {

    private ClassPathResource resource;

    private List<List<String>> records = new ArrayList<>();

    public static String COMMA = ",";

    public void readResource() {
        String line;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                resource.getInputStream()))) {
            while ((line = reader.readLine()) != null) {
                String[] units = line.split(COMMA);
                records.add(Arrays.asList(units));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}