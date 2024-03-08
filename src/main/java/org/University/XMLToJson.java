package org.University;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class XMLToJson {

    public static void XMLToJsonFile(ListWrapper listWrapper) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new Jdk8Module());
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        String string = objectMapper.writeValueAsString(listWrapper);


        File directory = new File("src/main/resources/JsonReqs/");
        if(!directory.exists()) {
            directory.mkdirs();
        }
        LocalDateTime localDateTime = LocalDateTime.now();
        String formattedDateTime = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss_"));
        File file = new File("src/main/resources/JsonReqs/" + formattedDateTime + "req.json");
        try(FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(string);
        }

        System.out.println(string);
    }
}
